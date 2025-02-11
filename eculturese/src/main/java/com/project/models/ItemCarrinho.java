package com.project.models;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;
    private double preco;

    public ItemCarrinho(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemCarrinho(Produto produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
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
    public double calcularSubTotal(){
        return produto.getPreco() * quantidade;
    }

    public String toString(){
        return "Produto: " + produto.getNome()+
                "Quntidade: " + quantidade +
                " preco: "  + produto.getPreco()+
                " SubTotal: " + calcularSubTotal();

    }


}
