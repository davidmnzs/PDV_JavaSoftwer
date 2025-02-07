package com.project.repositores.Impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.*;
import com.project.models.Carrinho;
import com.project.models.ItemCarrinho;
import com.project.models.Venda;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.eq;

public class VendaImpl  implements vendaRepository {
    private final MongoCollection<Document> collection;
    Document doc = new Document();

    public VendaImpl(MongoDatabase database) {
        collection = database.getCollection("Vendas");
    }
    private List<Document> converterItensParaDocument(List<ItemCarrinho> itens) {
        List<Document> listaItens = new ArrayList<>();

        for (ItemCarrinho item : itens) {
            Document itemDoc = new Document()
                    .append("produto", item.getProduto().getNome())
                    .append("quantidade", item.getQuantidade())
                    .append("preco_unitario", item.getProduto().getPreco())
                    .append("subtotal", item.calcularSubTotal());

            listaItens.add(itemDoc);
        }

        return listaItens;
    }
    @Override
    public void salvar(Venda venda){
        List<ItemCarrinho> itens = venda.vendaFinalizada();

        Document doc = new Document()
                .append("itens", converterItensParaDocument(itens));
        collection.insertOne(doc);
        System.out.println("Venda registrado com sucesso!");
    }


}
