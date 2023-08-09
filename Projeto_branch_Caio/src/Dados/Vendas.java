package Dados;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Negocio.Excecoes_Repositorio;
import Negocio.seeds.Produtos;

public class Vendas {
	private Estoque estoque;
	private LocalDateTime horaVenda;
	private List<Produtos> prodVenda=new ArrayList<Produtos>();//mudar a variavel repositorio por um arrayList de produtos
	private String nomeFuncionario;
	private RepositorioDeProdutos repProdutos;
	Scanner scan=new Scanner(System.in);
	
	
	public void efetuarCompra() {
		String nomeProd="";
		String nomeProdCarrinho="";
		String marca="";
		List<Produtos> prodPesquisa=new ArrayList<Produtos>();
		System.out.println("Você selecionou Efetuar Compra\nDigite o nome do produto para ser pesquisado");
		try {
			System.out.println("Digite o nome do produto");
			nomeProd=scan.nextLine();
			
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
		
		prodPesquisa = repProdutos.existeProdutoPorNome(nomeProd);//retorna o produto do repositorio que são do tipo prod.
		
		
		if(prodPesquisa.isEmpty()) {
			throw Excecoes_Repositorio.produtoNaoContemNome();
		}
		else {
			System.out.println(prodPesquisa);
		}
		
		try{
			System.out.println("Quai produto deseja adicionar ao carrinho");
			nomeProdCarrinho=scan.nextLine();
			
			System.out.println("Digite a marca do produto");
			marca=scan.nextLine();
		}
		catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
		
		prodVenda=repProdutos.ProdNomeParaAdicionarNoCarrinho(nomeProdCarrinho, marca);
		
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
