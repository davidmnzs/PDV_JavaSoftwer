package com.project;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.Cliente;
import com.project.repositores.Impl.ClienteImpl;

public class Main {
    public static void main(String[] args) {

                try {
                    MongoClient mongoClient = new MongoClient("localhost", 27017);
                    MongoDatabase database = mongoClient.getDatabase("teste");
                    ClienteImpl ClienteRepository = new ClienteImpl(database);

                    Cliente cliente2554 = new Cliente();
                    cliente2554.setName("Davsdghoso");
                    cliente2554.setCpf("78952323525");
                    cliente2554.setIdade(132);
                    cliente2554.setRG("7693265");

                    ClienteRepository.registrar(cliente2554);
                   // ClienteRepository.atualizar(cliente2554);

                }
               catch (Exception e) {
            System.out.println(e.getMessage());
        }
            }
        }

