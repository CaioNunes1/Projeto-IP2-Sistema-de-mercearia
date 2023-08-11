package com.example.sistemademercearia.negocio;

import com.example.sistemademercearia.Dados.RepositorioDeProdutos;
import com.example.sistemademercearia.negocio.beans.Produto;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaDeVendas {
	private RepositorioDeProdutos repProd;
	private LocalDateTime horaVenda;
	private ArrayList <Produto> carrinhoDeCompras;

	//CONSTRUTOR:
	public SistemaDeVendas (RepositorioDeProdutos repositorioDeProdutos ) {
		this.repProd = repositorioDeProdutos;
		this.carrinhoDeCompras = new ArrayList<>();
	}

	public void efetuarVenda() {

	}
	public void cancelarVenda() {

	}
	public void alterarProduto(){

	}
	public void removerProduto() {

	}


}