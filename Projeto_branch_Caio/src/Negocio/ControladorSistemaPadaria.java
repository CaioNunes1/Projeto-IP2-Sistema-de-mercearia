package Projeto_branch_Caio.src.Negocio;

import Projeto_branch_Caio.src.Dados.*;
import Projeto_branch_Caio.src.Negocio.seeds.Funcionario;
import Projeto_branch_Caio.src.Negocio.seeds.Perfil;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ControladorSistemaPadaria {
	Scanner scan=new Scanner(System.in);
	private static ControladorSistemaPadaria controlador;
	private RepositorioDeFornecedor repFornecedor;
	private RepositorioDePerfis repPerfis;
	private RepositorioDeProdutos repProdutos;
	private RepositorioFuncionarios repFuncionarios;
	private RepositorioVendas repVendas;
	
	private ControladorSistemaPadaria() {
		repFornecedor=new RepositorioDeFornecedor();
		repPerfis=new RepositorioDePerfis();
		repProdutos=new RepositorioDeProdutos();
		repFuncionarios=new RepositorioFuncionarios();
		
	}
	public static synchronized ControladorSistemaPadaria getInstancia() {
		if(controlador==null) {
			controlador=new ControladorSistemaPadaria();
		}
		return controlador;
		
	}
	public int paginaInicial() {
		int opMostrarMenu=0;
		boolean opcaoValida=false;
		System.out.println("Bem vindo ao sitema da mercearia \n1-Acesso ao menu\n-2Adicionar perfil\n3-Sair");
		while(opcaoValida!=true) {
			try {
				opMostrarMenu=scan.nextInt();
				System.out.printf("Op��o %i digitada...");
				if(opMostrarMenu<1|| opMostrarMenu>3) {
					System.out.println("Entre com uma op��o entre 1 e 3");
				}
				else {
					opcaoValida=true;
				}
			}catch(InputMismatchException e){
				System.out.println("Entrada inv�lida o valor digitado n�o � um inteiro");
			}catch(NullPointerException e) {
				System.out.println("Entrada nula, digite novamente");
			}
		}
		
		return opMostrarMenu; 
	}
	public void mostrarMenuPrincipal() {
		String nome="";
		String senha="";
		String categoria="";
		int op=0,opFunc=0;
		System.out.println("Bem vindo ao menu principal da mercearia");
		int opMostraMenu=paginaInicial();
		if(opMostraMenu==1) {
			try {
				System.out.println("Digite seu nome");
				nome=scan.nextLine();
				
				System.out.println("Digite sua senha");
				senha=scan.nextLine();
				
			}catch(NullPointerException e) {
				System.out.println("Entrada nula, digite novamente");
			}
			for(Perfil p:repPerfis.getPerfisRep()) {
				if(p.getNome().equals(nome)&& p.getSenha().equals(senha)) {
					categoria=p.getUsuario().getCategoria();
					break;
				}
			}
			
			if(categoria.equalsIgnoreCase("Funcion�rio")) {
				System.out.printf("Bem vindo funcion�rio %s",nome);
				try {
					System.out.println("Op��es:\n1-Efeturar compra");
					 opFunc=scan.nextInt();	
				}catch(NullPointerException e) {
					System.out.println("Entrada nula, digite novamente");
				}catch(InputMismatchException e) {
					System.out.println("Entrada inv�lida o valor digitado n�o � um inteiro");
				}
				if(opFunc!=1) {
					//chamar o metodo efetuaar compra
				}
				
			}
			if(categoria.equalsIgnoreCase("Gerente")) {
				
				System.out.printf("Bem vindo funcion�rio %s",nome);
				try {
					System.out.println("Op��es:\n1-Efeturar compra\n2-Adicionar produto no estoque\n"
							+ "3-Remover produto do estoque\n4-Relatorio do estoque\n5-Hist�rico de Vendas");
					op=scan.nextInt();
				}catch(NullPointerException e) {
					System.out.println("Entrada nula, digite novamente");
				}catch(InputMismatchException e) {
					System.out.println("Entrada inv�lida o valor digitado n�o � um inteiro");
				}
				if(op<0|| op>5) {
					System.out.println("Digite um valor que esteja nas op��es.");
				}
			}
			
			
		}
	}
	
	public void adicionarFuncionario() {
		String cidade="";
		String bairro="",ruaNumero="",endereco="",senha="";
		System.out.println("Qual tipo de funcionario deseja dicionar\n1-Gerente\n2-Funcion�rio");
		String categoria="";
		//OP��O MENU
		try{
			int opPerfil=scan.nextInt();
			if(opPerfil==1) {
				categoria="Gerente";
			}
			if(opPerfil==2) {
				categoria="Funcion�rio";
			}
		}catch(InputMismatchException e) {
			System.out.println("Entrada inv�lida o valor digitado n�o � um inteiro");
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente");
		}
		
		//NOME FUNCIONARIO
		System.out.println("Digite o nome do funcionario");
		String nome=scan.nextLine();
		
		
		//CPF DO FUNCIONARIO
		System.out.println("Digite o cpf do funcionario em n�meros");
		String cpf=scan.nextLine();
		int cpfInt=0;
		try {
				cpfInt=Integer.parseInt(cpf);
				System.out.printf("o numero do cpf � %i",cpfInt);
		}
		catch(NumberFormatException  e){
			System.out.println("Entrada inv�lida, o valor digitado n�o � um n�mero");
		}
		
		
		//DATA DE NASCIMENTO
		System.out.println("Digite a data de aniversario do funcionario no formato dd/MM/yyyy");
		String dataAniversarioStr=scan.nextLine();
		
		DateTimeFormatter formatar=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAniversario=null;
		
		try {
            dataAniversario = LocalDate.parse(dataAniversarioStr, formatar);
            
            System.out.println("Data de anivers�rio: " + dataAniversario.format(formatar));
        } catch (DateTimeParseException e) {
            System.out.println("Data inv�lida! Certifique-se de digitar a data no formato correto (dd/MM/yyyy).");
        }
		
		
		//ENDERE�O DO FUNCIONARIO
		try {
			System.out.println("Digite o cidade do funcionario:");
			cidade=scan.nextLine();	
			
			System.out.println("Digite o bairro:");
			bairro=scan.nextLine();
			
			System.out.println("Digite a rua e o n�mero:");
			ruaNumero=scan.nextLine();
			endereco=cidade+" "+bairro+" "+ruaNumero;
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
			
		
		System.out.printf("Funcionario %s do tipo %s adicionado",nome,categoria);
		
		
		Funcionario funcionario=new Funcionario(nome,cpfInt,dataAniversario,endereco,categoria);
		repFuncionarios.cadastrarPerfil(funcionario);
		
		try{
			System.out.println("Agora crie uma senha do perfil para acesar o sistema");
			senha=scan.nextLine();
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
		Perfil perfil=new Perfil(nome,senha,funcionario);
		repPerfis.cadastrarPerfil(perfil);
		
		
	}
	
	
	
}
