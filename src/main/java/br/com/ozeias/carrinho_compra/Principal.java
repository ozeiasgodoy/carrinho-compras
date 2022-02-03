/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ozeias.carrinho_compra;

import java.math.BigDecimal;



public class Principal { 
    public static void main (String [] args) { 
        CarrinhoCompras carrinhocompras = new CarrinhoCompras();
        
        CarrinhoComprasFactory carFac = new CarrinhoComprasFactory();
        carrinhocompras = carFac.criar("Carlos");
        
        Produto prod = new Produto(Long.valueOf(1), "TV");		
		BigDecimal valor = new BigDecimal("10000");        
        carrinhocompras.adicionarItem(prod, valor, 1);
		
		prod = new Produto(Long.valueOf(3), "Item a ser removido");		
		valor = new BigDecimal("5000.00");        
        carrinhocompras.adicionarItem(prod, valor, 1);
		
		prod = new Produto(Long.valueOf(1), "TV");		
		valor = new BigDecimal("200.989");        
        carrinhocompras.adicionarItem(prod, valor, 1);
		
		prod = new Produto(Long.valueOf(2), "Forno");		
		valor = new BigDecimal("400.9889");        
        carrinhocompras.adicionarItem(prod, valor, 1);
		
		System.out.println(carrinhocompras.getItens().size());
		carrinhocompras.removerItem(4);
		System.out.println(carrinhocompras.getItens().size());
		
		carrinhocompras = carFac.criar("Luiz");
		prod = new Produto(Long.valueOf(2), "Forno");		
		valor = new BigDecimal("400.9889");        
        carrinhocompras.adicionarItem(prod, valor, 1);
		
        System.out.println(carrinhocompras.getValorTotal()); 
		System.out.println(carFac.getValorTicketMedio());
		
		carrinhocompras = carFac.criar("Carlos");
		prod = new Produto(Long.valueOf(3), "teste");		
		valor = new BigDecimal("500");
		carrinhocompras.adicionarItem(prod, valor, 1);
		System.out.println(carrinhocompras.getValorTotal()); 
		carFac.invalidar("Carlos");
		
		
		System.out.println(carrinhocompras.getValorTotal()); 
		System.out.println(carFac.getValorTicketMedio()); 
    } 
}
