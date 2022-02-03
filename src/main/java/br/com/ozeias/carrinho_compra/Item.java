package br.com.ozeias.carrinho_compra;

import java.math.BigDecimal;

public class Item {

    private Produto produto;
    private BigDecimal valorUnitario = new BigDecimal("0");
    private int quantidade;

    public Item(Produto produto, BigDecimal valorUnitario, int quantidade) {
		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
    }

    public Produto getProduto() {
		return produto;
    }

    public BigDecimal getValorUnitario() {
		return valorUnitario;
    }

    public int getQuantidade() {
		return quantidade;
    }

    public BigDecimal getValorTotal() {
		BigDecimal total = new BigDecimal("0");
		total = BigDecimal.valueOf(getQuantidade()).multiply(getValorUnitario());
		return total;
    }

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
