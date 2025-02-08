package com.project.testesUnitarios;
import java.util.Scanner;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.project.models.*;
import com.project.repositores.Impl.VendaImpl;

public class TesteCarrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("",0.0);
        Carrinho carrinho = new Carrinho();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Digite o nome do produto: ");
            produto1.setNome(sc.next());
            System.out.println("A quantidade: ");
            int quantidade = sc.nextInt();

            ItemCarrinho item1 = new ItemCarrinho(produto1, quantidade);


            carrinho.adicionarItem(item1);
            count = count +1;

            System.out.println("Finalizar ? [Y/N]: ");
            char ch = sc.next().charAt(0);
            if (ch == 'Y') {
                flag = false;
            }else{
                flag = true;
            }
        }
     Venda venda = new Venda(carrinho);

    carrinho.finalizar(carrinho);

        sc.close();   
        
    }
}

