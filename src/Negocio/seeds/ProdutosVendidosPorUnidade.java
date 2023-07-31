package Negocio.seeds;

public abstract class ProdutosVendidosPorUnidade extends Produtos {
    private int quantidade;

    //CONSRUTOR:
    public ProdutosVendidosPorUnidade(String nomeProduto, String marcaProduto, double precoProduto,double precoVendido, int quantidadeProduto){
        super(nomeProduto, marcaProduto ,precoProduto,precoVendido);
        this.quantidade = quantidadeProduto;
    }

    //MÉTODOS:
    public double CalculoPreco (double preco){
        double valor;

        valor = preco * getQuantidade();
        return valor;
    }

    //GETS AND SETS:
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
