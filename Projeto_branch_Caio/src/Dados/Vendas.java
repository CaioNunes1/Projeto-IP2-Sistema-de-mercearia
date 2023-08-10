package Projeto_branch_Caio.src.Dados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Negocio.Excecoes_Repositorio;
import Projeto_branch_Caio.src.Dados.RepositorioDeProdutos;
import Projeto_branch_Caio.src.Negocio.seeds.Produtos;
import Projeto_branch_Caio.src.Negocio.seeds.ProdutosVendidosPorUnidade;

public class Vendas {
	private Estoque estoque;
	private LocalDateTime horaVenda;
	private List<Produtos> prodVenda=new ArrayList<Produtos>();//mudar a variavel repositorio por um arrayList de produtos
	private String nomeFuncionario;
	private RepositorioDeProdutos repProdutos;


	public Vendas(LocalDateTime horaVenda,List<Produtos> prodVenda,String nomeFuncionario) {
		this.horaVenda=horaVenda;
		this.prodVenda=prodVenda;
		this.nomeFuncionario=nomeFuncionario;
	}

	Scanner scan=new Scanner(System.in);
	
	
	public void efetuarCompra() {
		String nomeProd="";
		String nomeProdCarrinho="";
		String marca="";
		int quantidade=0;
		Produtos prodEscolhido;
		List<Produtos> prodPesquisa;
		System.out.println("Voc� selecionou Efetuar Compra\nDigite o nome do produto para ser pesquisado");
		try {
			System.out.println("Digite o nome do produto");
			nomeProd=scan.nextLine();
			
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
		
		prodPesquisa = repProdutos.existeProdutoPorNome(nomeProd);//retorna o produto do repositorio que s�o do tipo prod.
		
		
		if(prodPesquisa.isEmpty()) {
			throw Excecoes_Repositorio.produtoNaoContemNome();
		}
		else {
			System.out.println(prodPesquisa);
		}
		
		try{
			System.out.println("Qual produto deseja adicionar ao carrinho");
			nomeProdCarrinho=scan.nextLine();
			
			System.out.println("Digite a marca do produto");
			marca=scan.nextLine();
		}
		catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}

		prodEscolhido=repProdutos.ProdNomeParaAdicionarNoCarrinho(nomeProdCarrinho, marca);
		if(prodEscolhido!=null){
			System.out.println("Produto escolhido");
		}

		else{//aqui abrir uma tela so dizendo a mensgem a baixo
			System.out.println("Produto não existente");
		}

		if(prodEscolhido instanceof ProdutosVendidosPorUnidade){
			try{
				System.out.println("Digite a quantidade que você quer do produto");
				quantidade=scan.nextInt();
			}
			catch (NullPointerException e){
				System.out.println("Entrada nula, digite novamente ");
			}
			catch (InputMismatchException e){
				System.out.println("Entrada inv�lida o valor digitado n�o � um inteiro");
			}
			if(quantidade>0){
				//
			}
		}

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

	@Override
	public String toString() {
		return "Vendas{" +
				", horaVenda=" + horaVenda +
				", prodVenda=" + prodVenda +
				", nomeFuncionario='" + nomeFuncionario + '\'' +
				'}';
	}
}
