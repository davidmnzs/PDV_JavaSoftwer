package com.project.models;
import java.util.ArrayList;

public class Estoque{
    private ArrayList<Produto> produtos;
    //array list dentro de eestoque para iterar os elementos:
    // construtor
    public Estoque(){
        this.produtos = new ArrayList<>();
    }
    // Adiciona prod a lista

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    //retorna a list de prod

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    public void exiberodutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
            System.out.println(produto.getQuantidade());
            System.out.println("------------");
        }
    }


}

