package com.project.models;

public class Produto {
    private String nome;
    private String categoria;
    private Double preco;
    private int quantidade;
    private String code;

    //construtor de produto com valores nulos
    public Produto(String nome, Double preco) {
        this.nome = "";
        this.preco = 0.0;
    }

    public Produto(String nome, String categoria, Double preco, int quantidade, String code) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.code = code;
    }

    public Produto(String nome, String categoria, Double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Categoria " + categoria+ "\n" +
                "Preço " + preco+ "\n" +
                "Quantidade " + quantidade+ "\n"+
                "Code: " + code;

    }
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
