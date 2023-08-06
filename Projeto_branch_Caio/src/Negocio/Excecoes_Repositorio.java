package Negocio;

public class Excecoes_Repositorio extends RuntimeException{

	public Excecoes_Repositorio(String mensagem) {
		super(mensagem);
	}
	//EXCE��ES REPOSITORIO DE PRODUTOS
	public static Excecoes_Repositorio produtoExistente() {
		return new Excecoes_Repositorio("Produto j� existente");
	}
	
	public static Excecoes_Repositorio produtoNaoExistente() {
		return new Excecoes_Repositorio("Produto n�o existente");
		
	}
	
	
	//EXCE��ES REPOSITORIO DE FUNCIONARIOS
	public static Excecoes_Repositorio funcionarioExistente() {
		return new Excecoes_Repositorio("Funcionario j� existente");
	}
	
	public static Excecoes_Repositorio funcionarioNaoExistente() {
		return new Excecoes_Repositorio("Funcion�rio n�o existente");
		
	}
	
	//EXCE��ES REPOSITORIO DE PERFIS
	public static Excecoes_Repositorio perfilExistente() {
		return new Excecoes_Repositorio("Esse j� existente");
	}
	
	public static Excecoes_Repositorio perfilNaoExistente() {
		return new Excecoes_Repositorio("Esse perfil n�o existente");
		
	}
}
