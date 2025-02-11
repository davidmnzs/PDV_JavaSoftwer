package com.project.services;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Estoque;
import com.project.models.Produto;
import com.project.repositores.Impl.ProdutoImpl;

public class EstoqueService {

    // REGRA DE NEGOCIO BASICA, QUANDO VAI ADICIONAR UM PRODUTO A QUANTIDADE TEM QUER SER
    // QNT > 0
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase database = mongoClient.getDatabase("teste");
    ProdutoImpl produtoRepository = new ProdutoImpl(database);

    public void Adicionar(Estoque estoque, Produto produto) {
        if (produto.getQuantidade() > 0) {
            estoque.adicionarProduto(produto);
            produtoRepository.registrar(produto);

        }else{
            System.out.println("Produto invalido, adicione quantidade");
            return;
        }
    }
}
