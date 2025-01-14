package com.project.testesUnitarios;
import java.util.Scanner;

import com.project.models.*;

public class TesteCarrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("",0.0);
        Carrinho carrinho = new Carrinho();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count != 2 ) {
        System.out.println("Digite o nome do produto: ");
        produto1.setNome(sc.next());
        System.out.println("A quantidade: ");
        int quantidade = sc.nextInt();

        ItemCarrinho item1 = new ItemCarrinho(produto1, quantidade);
        
        
        carrinho.adicionarItem(item1);
        count = count +1;
        }
        

        carrinho.escrever();  
        sc.close();   
        
    }
}

