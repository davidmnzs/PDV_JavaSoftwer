package com.project.testesUnitarios;
import java.util.Scanner;

import com.project.models.Carrinho;
import com.project.models.ItemCarrinho;
import com.project.models.Produto;
import com.project.models.Venda;
import com.project.repositores.Impl.VendaImpl;

public class TesteUnitarioVenda {

        public static void main(String[] args) {
            // Criação de uma venda

            Carrinho carrinho = new Carrinho();
            Venda venda1 = new Venda(carrinho);
             Produto produto1 = new Produto("",0.0);
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
            venda1.vendaFinalizada();
            System.out.println("Vendas realizadas:");
             sc.close();
    }

}



