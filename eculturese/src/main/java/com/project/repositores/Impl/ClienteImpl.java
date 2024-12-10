package com.project.repositores.Impl;
import com.mongodb.Mongo;
import com.mongodb.client.*;
import com.project.models.Cliente;

import org.bson.Document;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
public class ClienteImpl implements clienteRepository{
    private final MongoCollection<Document> collection;
    Document doc = new Document();

    public ClienteImpl(MongoDatabase database){
        this.collection = database.getCollection("Cliente");
    }
    @Override
    public void registrar(Cliente cliente) {

        doc.append("Nome", cliente.getName())
        .append("Idade", cliente.getIdade())
        .append("RG", cliente.getRg());
       collection.insertOne(new Document(doc));

        System.out.println("Cliente registrado com sucesso!");
    }

    // metodo para fazer busca pelo nome: 
    @Override
    public Cliente buscarPorNome(String name) {
        Document doc = collection.find(new Document("Nome", name)).first();
        if(doc == null)  return null;
        return new Cliente(doc.getString("ClienteNome"), doc.getString("CPF"), doc.getInteger("Idade"), doc.getString("RG"));
    }
    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> cliente = new ArrayList<>();
        for (Document doc : collection.find()) {
            cliente.add(new Cliente(doc.getString("Nome"), doc.getString("CPF"), doc.getInteger("Idade"), doc.getString("RG")));
        }
        return cliente;

    }
    @Override
    public void atualizar(Cliente cliente) {

    }
    @Override
    public void excluir(String name) {
        collection.deleteOne(new Document("Nome", name));
    }
}
