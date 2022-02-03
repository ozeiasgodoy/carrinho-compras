package br.com.ozeias.carrinho_compra;

public class Produto {

    private Long codigo;
    private String descricao;

    public Produto(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
    }

    public Long getCodigo() {
		return codigo;
    }

    public String getDescricao() {
		return descricao;
    }

}