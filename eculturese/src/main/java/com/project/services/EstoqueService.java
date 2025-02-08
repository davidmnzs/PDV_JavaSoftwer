package com.project.services;

import com.project.models.Estoque;
import com.project.models.Produto;

public class EstoqueService {

    // REGRA DE NEGOCIO BASICA, QUANDO VAI ADICIONAR UM PRODUTO A QUANTIDADE TEM QUER SER
    // QNT > 0

    public void Adicionar(Estoque estoque, Produto produto) {
        if (produto.getQuantidade() > 0) {
            estoque.adicionarProduto(produto);
        }else{
            System.out.println("Produto invalido, adicione quantidade");
            return;
        }
    }
}
