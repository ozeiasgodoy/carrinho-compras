package br.com.ozeias.carrinho_compra;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;


public class CarrinhoComprasFactory {
	String identificacaoCliente = null;
	Collection<CarrinhoComprasCliente> colCarCompras;

	public CarrinhoComprasFactory(){
		this.colCarCompras = new ArrayList<>() ;
	}

    public CarrinhoCompras criar(String identificacaoCliente) {
		CarrinhoCompras newCar = new CarrinhoCompras();
		if(colCarCompras.isEmpty()){
			
			colCarCompras.add(new CarrinhoComprasCliente(identificacaoCliente, newCar));
			return newCar;
		}
		else{
			for(CarrinhoComprasCliente carrinho : colCarCompras){
				if(carrinho.getIdentificacaoCliente().equals(identificacaoCliente))	
					return carrinho.carrinhoCompras;
			}		
			colCarCompras.add(new CarrinhoComprasCliente(identificacaoCliente, newCar));
			return newCar;
		}
	}    

    public BigDecimal getValorTicketMedio() {
	
		BigDecimal ticketMedio = new BigDecimal("0");
		for(CarrinhoComprasCliente carrinho : colCarCompras){
			ticketMedio = ticketMedio.add(carrinho.carrinhoCompras.getValorTotal());
		}
		ticketMedio = ticketMedio.divide(BigDecimal.valueOf(colCarCompras.size()));
		ticketMedio = ticketMedio.setScale(2, RoundingMode.HALF_EVEN);
		return ticketMedio ;
		
    }

    public boolean invalidar(String identificacaoCliente) {
		for(CarrinhoComprasCliente carrinho : colCarCompras){
			if(carrinho.getIdentificacaoCliente().equals(identificacaoCliente))	{
				colCarCompras.remove(carrinho);
				return true;
			}
		}
		return false;
    }
}
