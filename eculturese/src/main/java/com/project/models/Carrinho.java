package com.project.models;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.repositores.Impl.VendaImpl;

import java.util.List;
import java.util.ArrayList;

public class Carrinho{
    private String Cliente;
    private List<ItemCarrinho> itens;



    public Carrinho(){
        super();
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

    public void escrever(){
        if(getItens().isEmpty()){
            System.out.println("Não há produtos no carrinho ");
            return;
        }

        
        System.out.println("Produtos no carrinho: ");
        for(ItemCarrinho item : getItens()){
            Produto produto = item.getProduto();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço unitario: " + produto.getPreco());
            System.out.println("Subtotal: " + produto.getPreco()*item.getQuantidade());
            System.out.println("----------------------");
        }

    }

    public double calcularTotal(){
        return itens.stream().mapToDouble(ItemCarrinho::calcularSubTotal).sum();
    }


}
