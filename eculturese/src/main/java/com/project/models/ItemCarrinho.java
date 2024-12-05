package com.project.models;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String toString(){
        return "Produto: " + produto.getNome()+
                "Quntidade: " + quantidade +
                " preco: "  + produto.getPreco()+ 
                " SubTotal: " + calcularSubTotal();
    }
    public double calcularSubTotal(){
        return produto.getPreco() * quantidade;
    }
}
