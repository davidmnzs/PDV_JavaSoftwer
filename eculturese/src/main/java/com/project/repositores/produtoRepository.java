package com.project.repositores;

import java.util.List;

import com.project.models.Produto;

public class produtoRepository {
    public interface InnerprodutoRepository {
        void registrar (Produto produto);
        Produto buscarProduto(String id);
        List<Produto> buscarTodos();
        void atualizar(Produto produto);
        void excluir(String id);       
    }
}
