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

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", contato='" + contato + '\'' +
                ", rg='" + rg + '\'' +
                '}';
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
        int soma = 0;
        int resto = 0;
        for (int i = 0; i < 9; i++) {
            soma = soma +  Character.getNumericValue(cpf.charAt(i))*(10-i);
        }
        resto = 11 - (soma  % 11);

        if (resto == Character.getNumericValue(cpf.charAt(9))){
            // calcular 2 digito
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma = soma + Character.getNumericValue(cpf.charAt(i))*(11-i);
            }
            resto = 11 - (soma % 11);

            if (resto == Character.getNumericValue(cpf.charAt(10))){
                System.out.println("Cpf válido");
            }

            this.cpf = cpf;
        }else {
            System.out.println("Invalido");
        }
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

