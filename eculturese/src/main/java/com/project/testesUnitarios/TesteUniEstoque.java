package com.project.testesUnitarios;
import java.util.Scanner;

import com.project.models.*;

public class TesteUniEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Produto produto1 = new Produto("",0.0);

            Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count != 2) {
            System.out.println("Digite o nome do produto: ");
            produto1.setNome(sc.next());
            System.out.println("A quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("Digite o valor unitario: ");
            produto1.setPreco(sc.nextDouble());
           
            estoque.recebe(produto1.getNome(), quantidade, produto1.getPreco());
            count = count + 1;
        }
            estoque.exibe();

            
    }
}
