package com.project;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Cliente;
import com.project.repositores.Impl.ClienteImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                try {
                    MongoClient mongoClient = new MongoClient("localhost", 27017);
                    MongoDatabase database = mongoClient.getDatabase("teste");
                    ClienteImpl ClienteRepository = new ClienteImpl(database);

                    Cliente cliente2554 = new Cliente();
                    cliente2554.setName("Raqui2wn");
                    cliente2554.setCpf("11144477735");
                    cliente2554.setIdade(15);
                    cliente2554.setRG("124229075");
                    //ClienteRepository.registrar(cliente2554);
                    List<Cliente> todos = ClienteRepository.buscarTodos();

                    /*for (Cliente cliente : todos){
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Nome: " + cliente.getName());
                        System.out.println("Idade: " + cliente.getIdade());
                        System.out.println("RG: " + cliente.getRg());
                        System.out.println("--------------------");

                    }*/

                    ClienteRepository.atualizar(cliente2554);




                }
               catch (Exception e) {
            System.out.println(e.getMessage());
        }
            }
        }

