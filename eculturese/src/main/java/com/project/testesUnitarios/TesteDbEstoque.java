package com.project.testesUnitarios;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.repositores.Impl.ClienteImpl;
import com.project.repositores.Impl.ProdutoImpl;

public class TesteDbEstoque {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("teste");
        ProdutoImpl produtoRepository = new ProdutoImpl(database);


    }
}
