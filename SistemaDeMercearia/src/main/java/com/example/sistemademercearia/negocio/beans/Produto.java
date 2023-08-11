package com.example.sistemademercearia.negocio.beans;

public class Produto {
    private String nome;
    private String fabricante;
    private double precoProduto;
    private double PrecoVenda;
    private double quantidadeOuPeso;

    //CONSTRUTOR:
    public Produto(String nomeProduto, String fabricanteProduto, double precoProduto, double precoVendaProduto, double quantidadeOuPesoProduto ) {
		super();
		this.nome = nomeProduto;
		this.fabricante = fabricanteProduto;
		this.precoProduto = precoProduto;
		this.PrecoVenda = precoVendaProduto;
        this.quantidadeOuPeso = quantidadeOuPesoProduto;
	}

	//GETS AND SETS:
    public String getNome() {
        return nome;
    }
   
	public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public double getPrecoVenda() {
        return PrecoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        PrecoVenda = precoVenda;
    }

    public double getQuantidadeOuPeso() {
        return quantidadeOuPeso;
    }

    public void setQuantidadeOuPeso(double quantidadeOuPeso) {
        this.quantidadeOuPeso = quantidadeOuPeso;
    }
}