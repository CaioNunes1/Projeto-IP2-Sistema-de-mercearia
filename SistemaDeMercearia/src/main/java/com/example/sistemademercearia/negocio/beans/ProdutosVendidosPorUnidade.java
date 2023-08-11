package com.example.sistemademercearia.negocio.beans;

public class ProdutosVendidosPorUnidade extends Produto {
    private int quantidade;

    //CONSRUTOR:
    public ProdutosVendidosPorUnidade(String nome, String marca, double precoProduto, double precoVenda,
			Fornecedor fornecedor, int quantidade) {
		super(nome, marca, precoProduto, precoVenda);
		this.quantidade = quantidade;
	}

    //MÉTODOS:
    public double CalculoDoPreco (double preco){
        double valor;

        valor = preco * getQuantidade();
        return valor;
    }


	//GETS AND SETS:
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}