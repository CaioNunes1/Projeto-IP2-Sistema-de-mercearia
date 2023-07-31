package Negocio.seeds;

public abstract class ProdutosVendidosPorPeso extends Produtos {
    private double peso;


    //CONSTRUTOR:
    public ProdutosVendidosPorPeso(String nomeProduto, String marcaProduto, double precoProduto, double precoVendido, double pesoProduto) {
        super(nomeProduto, marcaProduto ,precoProduto,precoVendido);
        this.peso = pesoProduto;
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
