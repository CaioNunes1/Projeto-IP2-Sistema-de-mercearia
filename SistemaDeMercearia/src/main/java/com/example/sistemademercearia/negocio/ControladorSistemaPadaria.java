package com.example.sistemademercearia.negocio;

import com.example.sistemademercearia.Dados.RepositorioDePerfis;
import com.example.sistemademercearia.Dados.RepositorioFuncionarios;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ControladorSistemaPadaria {
	Scanner scan = new Scanner(System.in);
	private static ControladorSistemaPadaria controlador;
	private repositorioDeFornecedor repFornecedor;
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
				System.out.printf("Opção %i digitada...");
				if(opMostrarMenu<1|| opMostrarMenu>3) {
					System.out.println("Entre com uma opção entre 1 e 3");
				}
				else {
					opcaoValida=true;
				}
			}catch(InputMismatchException e){
				System.out.println("Entrada inválida o valor digitado não é um inteiro");
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

			if(categoria.equalsIgnoreCase("Funcionário")) {
				System.out.printf("Bem vindo funcionário %s",nome);
				try {
					System.out.println("Opções:\n1-Efeturar compra");
					 opFunc=scan.nextInt();
				}catch(NullPointerException e) {
					System.out.println("Entrada nula, digite novamente");
				}catch(InputMismatchException e) {
					System.out.println("Entrada inválida o valor digitado não é um inteiro");
				}
				if(opFunc!=1) {

				}

			}
			if(categoria.equalsIgnoreCase("Gerente")) {

				System.out.printf("Bem vindo funcionário %s",nome);
				try {
					System.out.println("Opções:\n1-Efeturar compra\n2-Adicionar produto no estoque\n"
							+ "3-Remover produto do estoque\n4-Relatorio do estoque\n5-Histórico de Vendas");
					op=scan.nextInt();
				}catch(NullPointerException e) {
					System.out.println("Entrada nula, digite novamente");
				}catch(InputMismatchException e) {
					System.out.println("Entrada inválida o valor digitado não é um inteiro");
				}
				if(op<0|| op>5) {
					System.out.println("Digite um valor que esteja nas opções.");
				}
			}


		}
	}

	public void adicionarFuncionario() {
		String cidade="";
		String bairro="",ruaNumero="",endereco="",senha="";
		System.out.println("Qual tipo de funcionario deseja dicionar\n1-Gerente\n2-Funcionário");
		String categoria="";
		//OPÇÃO MENU
		try{
			int opPerfil=scan.nextInt();
			if(opPerfil==1) {
				categoria="Gerente";
			}
			if(opPerfil==2) {
				categoria="Funcionário";
			}
		}catch(InputMismatchException e) {
			System.out.println("Entrada inválida o valor digitado não é um inteiro");
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente");
		}

		//NOME FUNCIONARIO
		System.out.println("Digite o nome do funcionario");
		String nome=scan.nextLine();


		//CPF DO FUNCIONARIO
		System.out.println("Digite o cpf do funcionario em números");
		String cpf=scan.nextLine();
		int cpfInt=0;
		try {
				cpfInt=Integer.parseInt(cpf);
				System.out.printf("o numero do cpf é %i",cpfInt);
		}
		catch(NumberFormatException  e){
			System.out.println("Entrada inválida, o valor digitado não é um número");
		}


		//DATA DE NASCIMENTO
		System.out.println("Digite a data de aniversario do funcionario no formato dd/MM/yyyy");
		String dataAniversarioStr=scan.nextLine();

		DateTimeFormatter formatar=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAniversario=null;

		try {
            dataAniversario = LocalDate.parse(dataAniversarioStr, formatar);

            System.out.println("Data de aniversário: " + dataAniversario.format(formatar));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida! Certifique-se de digitar a data no formato correto (dd/MM/yyyy).");
        }


		//ENDEREÇO DO FUNCIONARIO
		try {
			System.out.println("Digite o cidade do funcionario:");
			cidade=scan.nextLine();

			System.out.println("Digite o bairro:");
			bairro=scan.nextLine();

			System.out.println("Digite a rua e o número:");
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

	public void efetuarCompra() {
		String nomeProd="";
		String marca="";
		try {
			System.out.println("Você selecionou Efetuar Compra\nDigite o nome do produto");
			nomeProd=scan.nextLine();

			System.out.println("Digite a marca do produto");
			marca=scan.nextLine();
		}catch(NullPointerException e) {
			System.out.println("Entrada nula, digite novamente ");
		}
		repProdutos.existeProdutoPorNomeEMarca(nomeProd, marca);
	}
}