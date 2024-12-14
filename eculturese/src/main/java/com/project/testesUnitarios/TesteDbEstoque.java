package com.project.testesUnitarios;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Produto;
import com.project.repositores.Impl.ProdutoImpl;

public class TesteDbEstoque {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("teste");
        ProdutoImpl produtoRepository = new ProdutoImpl(database);

        Produto produto = new Produto("Notebook","Eletronicos", 1231.0,12, "432432");
        //produtoRepository.MostrarProduto("Notebook");
        Produto produto1 = produtoRepository.MostrarProduto("Notebook");
        if (produto1 != null) {
            System.out.println("Produto encontrado:\n " + produto1);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
