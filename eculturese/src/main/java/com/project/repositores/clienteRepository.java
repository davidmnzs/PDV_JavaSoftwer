package com.project.repositores;

import java.util.List;

import com.project.models.Cliente;

public class clienteRepository {
    public interface InnerclienteRepository {
        void registrar(Cliente cliente);
        Cliente buscarPorNome(String name);
        List<Cliente> buscarTodos();
        void atualizar(Cliente cliente);
        void excluir (String name);
    }
}
