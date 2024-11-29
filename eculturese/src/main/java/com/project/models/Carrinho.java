package com.project.models;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private String Cliente;
    private List<ItemCarrinho> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }
    public String getCliente(){
        return Cliente;
    }
    public void setCliente(String cliente){
        this.Cliente = cliente;
    }
    public List<ItemCarrinho> getItens(){
        return itens;
    }
    public void adicionarItem(ItemCarrinho item){
        this.itens.add(item);
    }
    public void removerItem(ItemCarrinho item){
        this.itens.remove(item);
    }
    public double calcularTotal(){
        return itens.stream().mapToDouble(ItemCarrinho::calcularSubTotal).sum();
    }
}
