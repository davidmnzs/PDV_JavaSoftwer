package com.project.testesUnitarios.testesService;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Estoque;
import com.project.models.Produto;
import com.project.repositores.Impl.ProdutoImpl;
import com.project.services.EstoqueService;

public class TesteService {
    public static void main(String[] args) {
        //ProdutoImpl produtoRepository = new ProdutoImpl(database);
        Estoque estoque = new Estoque();
        Produto produto = new Produto("tf","Elettronicos", 142.0,99, "4323232");
        EstoqueService Eservice = new EstoqueService();
        Eservice.Adicionar(estoque,produto);

        //Mostra todos
        //String mostra = produtoRepository.BuscarTodos().toString();
        //System.out.println(mostra);

        //Atualiza quant do produto
        //produtoRepository.atualizarProduto(produto);

        //produtoRepository.excluirProduto(produto);
    }
}
