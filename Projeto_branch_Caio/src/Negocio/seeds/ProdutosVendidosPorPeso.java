package Projeto_branch_Caio.src.Negocio.seeds;
import Projeto_branch_Caio.src.Negocio.seeds.Fornecedor;
public class ProdutosVendidosPorPeso extends Produtos {
    private double peso;
    private double precoPorQuilo;

    //CONSTRUTOR:
    public ProdutosVendidosPorPeso(String nome, String marca, double precoProduto, double precoVenda,
			Fornecedor fornecedor, double peso) {
		super(nome, marca, precoProduto, precoVenda, fornecedor);
		this.peso = peso;
	}
    public ProdutosVendidosPorPeso() {//construtor sem argumentos para auxiliar na instancia de um objeto do tipo prodVendidosPorPeso
    	
    }

    //MÉTODOS:
    public double CalculoPreco(){
        double valor;

        valor = precoPorQuilo * getPeso();
        return valor;
    }

	//GETS AND SETS:

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

	public double getPrecoPorQuilo() {
		return precoPorQuilo;
	}

	public void setPrecoPorQuilo(double precoPorQuilo) {
		this.precoPorQuilo = precoPorQuilo;
	}
	@Override
	public String toString() {
		return "ProdutosVendidosPorPeso [peso=" + peso + ", precoPorQuilo=" + precoPorQuilo + "]";
	}
}
