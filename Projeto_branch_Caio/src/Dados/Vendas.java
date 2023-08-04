package Dados;

import java.time.LocalDateTime;

import Negocio.seeds.Funcionario;
import Negocio.seeds.Produtos;

public class Vendas {
	private Estoque estoque;
	private RepositorioDeProdutos repProd;
	private LocalDateTime horaVenda;
	//private Produtos produto;
	//private Funcionario funcionario;
	public void efetuarVenda() {
		//funcionario efetua uma venda dhgewf
	}
	public void cancelarVenda() {
		
	}
	public void removerProduto() {
		
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public RepositorioDeProdutos getRepProd() {
		return repProd;
	}
	public void setRepProd(RepositorioDeProdutos repProd) {
		this.repProd = repProd;
	}
	public LocalDateTime getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(LocalDateTime horaVenda) {
		this.horaVenda = horaVenda;
	}
	
	
}
