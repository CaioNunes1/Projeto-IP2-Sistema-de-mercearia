package Negocio;

import Dados.RepositorioDeFornecedor;
import Dados.RepositorioDePerfis;
import Dados.RepositorioDeProdutos;
import Dados.RepositorioFuncionarios;
import Dados.RepositorioVendas;
import Negocio.seeds.Funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	public void adicionarFuncionario() {
		System.out.println("Qual tipo de perfil deseja Adicionar\n1-Gerente\n2-Funcionário");
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
		catch(Exception e){
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
        } catch (Exception e) {
            System.out.println("Data inválida! Certifique-se de digitar a data no formato correto (dd/MM/yyyy).");
        }
		
		System.out.printf("Funcionario %s do tipo Gerente adicionado",nome);
		Funcionario funcionario=new Funcionario(nome,cpfInt,dataAniversario,"",categoria);
		repFuncionarios.cadastrarPerfil(funcionario);
		
		
	}
}
