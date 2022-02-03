package br.com.ozeias.carrinho_compra;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class CarrinhoCompras {
	Collection<Item> colItem =  new ArrayList<>()  ;
	String identificacaocliente;
	
    public void adicionarItem(Produto produto, BigDecimal valorUnitario, int quantidade) {
		try{
			//Se primeiro item
			if(colItem.isEmpty()){
				colItem.add(new Item(produto, valorUnitario, quantidade));
				return;
			}
			else{
				for(Item item : colItem){
					if(item.getProduto().getCodigo().equals(produto.getCodigo()))	{

						item.setQuantidade(item.getQuantidade()+ quantidade);

						if(valorUnitario.compareTo(item.getValorUnitario()) > 0){
							item.setValorUnitario(valorUnitario);
						}	
						
						colItem.remove(item);
						colItem.add(new Item(produto, item.getValorUnitario(), item.getQuantidade()));
						return;
						
					}else{
						colItem.add(new Item(produto, valorUnitario, quantidade));
						return;
					}
				}		
			}
		}
		catch(RuntimeException ex){
			System.err.println(ex.getMessage());
		}
    }

    public boolean removerItem(Produto produto) {
		
		for(Item item : colItem){
			if(item.getProduto().getCodigo().equals(produto.getCodigo()))	{
				colItem.remove(item);
				return true;
			}
		}
		return false;
    }

    public boolean removerItem(int posicaoItem) {
		if (posicaoItem > colItem.size())
			return false;
		
		int posAux = 1;
		
		for(Item item : colItem){
			if (posAux == posicaoItem){
				colItem.remove(item);
				return true;
			}
			posAux++;
		}
		return false;
    }

    public BigDecimal getValorTotal() {
		BigDecimal valorTotal = new BigDecimal("0");
		for(Item item : colItem){
			valorTotal = valorTotal.add(item.getValorTotal());
		}
		
		return valorTotal;
    }

    public Collection<Item> getItens() {
		return colItem;
    }
}