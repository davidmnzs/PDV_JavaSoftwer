package com.project.models;
import java.util.ArrayList;
public class Estoque {
    ArrayList<Object> produtos = new ArrayList<Object>();

    public void recebe(String nome, int quantidade, Double preco){
        produtos.add(nome);
        produtos.add(quantidade);
        produtos.add(preco);
    }

    public void exibe(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
            System.out.println("-------------------------");
          }
          
    }
}

