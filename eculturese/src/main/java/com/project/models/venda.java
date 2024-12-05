package com.project.models;

import java.util.ArrayList;

public class venda {
    private ArrayList<Carrinho> carrinho;

    public venda(){
        this.carrinho = new ArrayList<>();
    }
    public void vendaConfirmada(Carrinho carrinho){
        this.carrinho.add(carrinho);
    }
    public ArrayList<Carrinho> getVendas(){
        return carrinho;
    }
    public void exibeVendas(){
        for (Carrinho carrinho : carrinho) {
            System.out.println(carrinho.getItens());
            System.out.println(carrinho.getCliente());
            System.out.println("------------");
        }
    }
}
