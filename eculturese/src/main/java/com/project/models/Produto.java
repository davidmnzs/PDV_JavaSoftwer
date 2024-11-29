package com.project.models;

public class Produto {
    private String nome;
    private String categoria;
    private Double preco;
    private String code;

    //construtor de produto com valores nulos
    public Produto(String nome, Double preco) {
        this.nome = "";
        this.preco = 0.0;
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
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
