package com.project.repositores.Impl;
import com.mongodb.client.*;
import com.project.models.Produto;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.MongoCollection;


public class ProdutoImpl implements produtoRepository {
    private final MongoCollection<Document> collection;
    Document doc = new Document();

    public ProdutoImpl(MongoDatabase database)   {
        this.collection = database.getCollection("Produtos");
    }
    @Override
    public void registrar(Produto produto){
        doc.append("Nome", produto.getNome());
        doc.append("Preco", produto.getPreco());
        doc.append("Categoria", produto.getCategoria());
        doc.append("Quantidade", produto.getQuantidade());
        collection.insertOne(doc);
        System.out.println("Produto Cadastrado com sucesso!");

    }
    @Override
    public Produto MostrarProduto(String nome){
       Document doc = collection.find(new Document("Nome", nome)).first();
           if (doc == null) return null;
        return new Produto(
                doc.getString("Nome"),
                doc.getString("Categoria"),
                doc.getDouble("Preco"),
                doc.getInteger("Quantidade")

        );
    }
    @Override
    public List<Produto> BuscarTodos(){
        List<Produto> produto = new ArrayList<>();
        for(Document doc : collection.find()){
            produto.add(new Produto(doc.getString("Nome"), doc.getString("Categoria"), doc.getDouble("Preco"), doc.getInteger("Quantidade")));
        }
        return produto;
    }
    @Override
    public void atualizarProduto(Produto produto){
        //Busca o prod
        Document query = new Document().append("Nome", produto.getNome());
        // Atualiza
        Document Update = new Document().append("$set", new Document("Quantidade", produto.getQuantidade()));
        collection.updateOne(query, Update);
    }
    @Override
    public void excluirProduto(Produto produto){
        Bson query = eq("Nome", produto.getNome());
        try {
            collection.deleteOne(query);
            System.out.println("Produto Excluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao excluir produto");
        }
    }





}
