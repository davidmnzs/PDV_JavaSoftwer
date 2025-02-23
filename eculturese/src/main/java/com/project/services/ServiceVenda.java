package com.project.services;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Carrinho;
import com.project.models.Cliente;
import com.project.models.Venda;
import com.project.repositores.Impl.VendaImpl;

public class ServiceVenda {
    Cliente cliente = new Cliente();
    Carrinho carrinho = new Carrinho();
    Venda venda = new Venda(carrinho);

    public void finalizar(Carrinho carrinho){

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("teste");
        Venda venda = new Venda(carrinho);
        VendaImpl vendaRepository = new VendaImpl(database);

        vendaRepository.salvar(venda);

    }
}
