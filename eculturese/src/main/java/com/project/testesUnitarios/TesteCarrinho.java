package com.project.testesUnitarios;
import java.util.Scanner;
import com.project.models.*;
import com.project.services.ServiceVenda;

public class TesteCarrinho {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while (flag) {
            Produto produto1 = new Produto("",0.0);
            System.out.println("Digite o nome do produto: ");
            produto1.setNome(sc.next());
            System.out.println("A quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("O valor : ");
            produto1.setPreco(sc.nextDouble());

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
            ServiceVenda serviceVenda = new ServiceVenda();
            serviceVenda.finalizar(carrinho);
            sc.close();
        
    }
}

