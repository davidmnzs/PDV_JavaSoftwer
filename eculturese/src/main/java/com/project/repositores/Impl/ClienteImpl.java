package com.project.repositores.Impl;
import com.mongodb.Mongo;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
public class ClienteImpl implements clienteRepository{
    private final MongoCollection<Document> collection;

    public ClienteImpl(MongoDatabase database){
        this.collection = database.getCollection("Cliente");
    }
}
