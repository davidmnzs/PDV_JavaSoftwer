package com.project.repositores.Impl;
import com.mongodb.Mongo;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import com.project.models.Cliente;

import org.bson.Document;
import org.bson.conversions.Bson;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class ClienteImpl implements clienteRepository{
    private final MongoCollection<Document> collection;
    Document doc = new Document();

    public ClienteImpl(MongoDatabase database){
        this.collection = database.getCollection("Cliente");
    }
    @Override
    public void registrar(Cliente cliente) {

        doc.append("Nome", cliente.getName())
                .append("CPF", cliente.getCpf())
        .append("Idade", cliente.getIdade())
        .append("RG", cliente.getRg());
       collection.insertOne(new Document(doc));

        System.out.println("Cliente registrado com sucesso!");
    }

    // metodo para fazer busca pelo nome: 
    @Override
    public Cliente buscarPorNome(String name) {
        Document doc = collection.find(new Document("Nome", name)).first();
        if(doc == null)  return null;
        return new Cliente(doc.getString("ClienteNome"), doc.getString("CPF"), doc.getInteger("Idade"), doc.getString("RG"));
    }
    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> cliente = new ArrayList<>();
        for (Document doc : collection.find()) {
            cliente.add(new Cliente(doc.getString("Nome"), doc.getString("CPF"), doc.getInteger("Idade"), doc.getString("RG")));
        }
        return cliente;

    }
    @Override
    public void atualizar(Cliente cliente) {
        //encontrar o doc
        Document query = new Document().append("Nome", "Raqui2wn");
        // atualiza o CPF
        Document Update = new Document("$set", new Document("CPF", cliente.getCpf()));

        collection.updateOne(query, Update);

    }
    @Override
    public void excluir(Cliente cliente) {
        Bson query = eq("Nome", "Raqui2wn");
        try{
            collection.deleteOne(query);
        }catch(Exception e){
            System.err.println("Erro ao excluir cliente: " + e.getMessage());
        }

    }
}
