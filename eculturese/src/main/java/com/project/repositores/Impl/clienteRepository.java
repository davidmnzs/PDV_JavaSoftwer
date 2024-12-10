package com.project.repositores.Impl;

import java.util.List;

import com.project.models.Cliente;

public interface clienteRepository {
        void registrar(Cliente cliente);
        Cliente buscarPorNome(String name);
        List<Cliente> buscarTodos();
        void atualizar(Cliente cliente);
        void excluir (String name);
    
}
