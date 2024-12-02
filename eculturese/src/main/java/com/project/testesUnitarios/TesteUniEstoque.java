package com.project.testesUnitarios;
import java.util.Scanner;

import com.project.models.*;

public class TesteUniEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
       

            Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count != 2) {

            //produto dentro do while para adicionar varios objetos 
             Produto produto1 = new Produto("",0.0);
            System.out.println("Digite o nome do produto: ");
            produto1.setNome(sc.next());
            System.out.println("A quantidade: ");
            produto1.setQuantidade(sc.nextInt());
            System.out.println("Digite o valor unitario: ");
            produto1.setPreco(sc.nextDouble());
            estoque.adicionarProduto(produto1);

           
           
            count = count + 1;
        }
            estoque.exiberodutos();

            
    }
}
