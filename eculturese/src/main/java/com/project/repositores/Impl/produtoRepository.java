package com.project.repositores.Impl;

import com.project.models.Produto;
import java.util.List;

public interface produtoRepository {

    void registrar(Produto produto);
    Produto MostrarProduto(String nome);
    List<Produto> BuscarTodos();
    void atualizarProduto(Produto produto);
    void excluirProduto(Produto produto);
}
