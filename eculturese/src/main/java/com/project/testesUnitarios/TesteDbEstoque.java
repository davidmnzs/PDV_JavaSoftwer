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

        Produto produto = new Produto("telefone","Eletronicos", 142.0,99, "4323232");
        produtoRepository.registrar(produto);

        //Mostra todos
        //String mostra = produtoRepository.BuscarTodos().toString();
        //System.out.println(mostra);

        //Atualiza quant do produto
        //produtoRepository.atualizarProduto(produto);

        // produtoRepository.excluirProduto(produto);
    }
}
