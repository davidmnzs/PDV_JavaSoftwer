package com.project.services;

import com.project.models.Carrinho;
import com.project.models.Cliente;
import com.project.models.Venda;

public class ServiceVenda {
    Cliente cliente = new Cliente();
    Carrinho carrinho = new Carrinho();
    Venda venda = new Venda(carrinho);

       void confirmarVenda() {
           Cliente cliente = new Cliente();
           Carrinho carrinho = new Carrinho();
           verificadorDeCpf cpf = new verificadorDeCpf();
           Venda venda = new Venda(carrinho);
           if(carrinho.calcularTotal()>0){

           }
       }





}
