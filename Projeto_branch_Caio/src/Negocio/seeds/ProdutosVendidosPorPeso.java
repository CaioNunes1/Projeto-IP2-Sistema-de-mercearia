package Negocio.seeds;

public abstract class ProdutosVendidosPorPeso extends Produtos {
    private double peso;


    //CONSTRUTOR:
    public ProdutosVendidosPorPeso(String nome, String marca, double precoProduto, double precoVenda,
			Fornecedor fornecedor, double peso) {
		super(nome, marca, precoProduto, precoVenda, fornecedor);
		this.peso = peso;
	}

    //MÉTODOS:
    public double CalculoPreco(double precoPorQuilo){
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
}
