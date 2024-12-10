package com.project.models;

public class Cliente {
    private String name;
    private String cpf;
    private int idade;
    private String contato;
    private String rg;

    //construtor cliente com valores nulos

    public Cliente() {

    }

    public Cliente(String name, String cpf, int idade, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato){
        this.contato = contato;
    }

    public String getRg(){
        return rg;
    }

    public void setRG(String rg){
        this.rg = rg;
    }

}

