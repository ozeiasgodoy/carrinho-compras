/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ozeias.carrinho_compra;

/**
 *
 * @author Oem
 */
public class CarrinhoComprasCliente{
	private String identificacaoCliente = null;
	CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
			
	public CarrinhoComprasCliente(String IdentificacaoCliente, CarrinhoCompras carrinhoCompras) {
		this.identificacaoCliente = IdentificacaoCliente;
		this.carrinhoCompras = carrinhoCompras;
	}

	/**
	 * @return the identificacaoCliente
	 */
	public String getIdentificacaoCliente() {
		return identificacaoCliente;
	}
}
