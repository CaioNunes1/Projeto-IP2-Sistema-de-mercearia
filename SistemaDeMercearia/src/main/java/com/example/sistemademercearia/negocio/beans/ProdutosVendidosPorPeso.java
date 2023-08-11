package com.example.sistemademercearia.negocio.beans;

public  class ProdutosVendidosPorPeso extends Produto {
    private double peso;

    //CONSTRUTOR:
    public ProdutosVendidosPorPeso(String nome, String marca, double precoProduto, double precoVenda,
			Fornecedor fornecedor, double peso) {
		super(nome, marca, precoProduto, precoVenda);
		this.peso = peso;
	}

    //MÉTODOS:
    public double CalculoDoPreco(){
        double valor;

        valor = getPrecoProduto() / getPeso();
        return valor;
    }

	//GETS AND SETS:
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


}