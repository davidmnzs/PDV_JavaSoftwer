package com.project.testesUnitarios;
import com.project.models.*;

public class TesteCarrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("",0.0);
        Produto produto2 = new Produto("",0.0);

        produto1.setNome("notebook");
        produto1.setPreco(22.0);

        produto2.setNome("notebook");
        produto2.setPreco(39.0);
        


        ItemCarrinho item1 = new ItemCarrinho(produto1, 1);
        ItemCarrinho item2 = new ItemCarrinho(produto2, 1);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        System.out.println("Total do Carrinho: R$" + carrinho.calcularTotal());
    }
}

