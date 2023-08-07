package Dados;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Negocio.seeds.Funcionario;
import Negocio.seeds.Produtos;

public class Vendas {
	private Estoque estoque;
	private RepositorioDeProdutos repProd;//mudar a variavel repositorio por um arrayList de produtos
	private LocalDateTime horaVenda;
	private List<Produtos> prodVenda=new ArrayList<Produtos>();
	private String nomeFuncionario;
	//private Produtos produto;
	//private Funcionario funcionario;
	public void efetuarVenda(Produtos produto,LocalDateTime dataHora,String nomeFuncionario) {
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
	public List<Produtos> getProdVenda() {
		return prodVenda;
	}
	public void setProdVenda(List<Produtos> prodVenda) {
		this.prodVenda = prodVenda;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	
}
