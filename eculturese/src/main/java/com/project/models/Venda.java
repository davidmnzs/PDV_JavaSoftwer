package com.project.models;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemCarrinho> itens;
    public Venda(Carrinho carrinho) {
        this.itens = new ArrayList<>(carrinho.getItens());
    }
    public void vendaFinalizada(){
            if(itens.isEmpty()){
                System.out.println("Não há produtos no carrinho ");
            }

            System.out.println("Produtos no carrinho: ");
            for(ItemCarrinho item : itens){
                Produto produto = item.getProduto();
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Quantidade: " + item.getQuantidade());
                System.out.println("Preço unitario: " + produto.getPreco());
                System.out.println("Subtotal: " + item.calcularSubTotal());
                System.out.println("----------------------");
            }
    }

}
