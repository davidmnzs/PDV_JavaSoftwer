package com.project.testesUnitarios;
import java.util.Scanner;

import com.project.models.*;

public class TesteCarrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("",0.0);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        produto1.setNome(sc.nextLine());
        System.out.println("A quantidade: ");
        int quantidade = sc.nextInt();

        ItemCarrinho item1 = new ItemCarrinho(produto1, quantidade);
        
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.escrever();     
        
    }
}

