package com.project;
import com.project.models.Carrinho;
import com.project.models.ItemCarrinho;
import com.project.models.Produto;

public class Main {
    public static void main(String[] args) {
    
                    // Criando produtos
                    Produto produto1 = new Produto("Notebook", 3000.00);
                    Produto produto2 = new Produto("Mouse", 50.00);
            
                    // Criando itens do carrinho
                    ItemCarrinho item1 = new ItemCarrinho(produto1, 1); // 1 unidade de Notebook
                    ItemCarrinho item2 = new ItemCarrinho(produto2, 2); // 2 unidades de Mouse
            
                    // Criando o carrinho e adicionando itens
                    Carrinho carrinho = new Carrinho();
                    carrinho.setCliente("João");
                    carrinho.adicionarItem(item1);
                    carrinho.adicionarItem(item2);
                    
                    
                    // Calculando o total do carrinho
                    System.out.println("Total do carrinho: R$ " + carrinho.calcularTotal());
                }
            

    }