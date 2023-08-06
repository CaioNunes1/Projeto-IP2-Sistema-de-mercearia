package Negocio;

public class Excecoes_Repositorio extends RuntimeException{

	public Excecoes_Repositorio(String mensagem) {
		super(mensagem);
	}
	//EXCEÇÕES REPOSITORIO DE PRODUTOS
	public static Excecoes_Repositorio produtoExistente() {
		return new Excecoes_Repositorio("Produto já existente");
	}
	
	public static Excecoes_Repositorio produtoNaoExistente() {
		return new Excecoes_Repositorio("Produto não existente");
		
	}
	
	
	//EXCEÇÕES REPOSITORIO DE FUNCIONARIOS
	public static Excecoes_Repositorio funcionarioExistente() {
		return new Excecoes_Repositorio("Funcionario já existente");
	}
	
	public static Excecoes_Repositorio funcionarioNaoExistente() {
		return new Excecoes_Repositorio("Funcionário não existente");
		
	}
	
	//EXCEÇÕES REPOSITORIO DE PERFIS
	public static Excecoes_Repositorio perfilExistente() {
		return new Excecoes_Repositorio("Esse já existente");
	}
	
	public static Excecoes_Repositorio perfilNaoExistente() {
		return new Excecoes_Repositorio("Esse perfil não existente");
		
	}
}
