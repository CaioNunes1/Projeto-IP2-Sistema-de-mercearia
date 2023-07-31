package Negocio.seeds;

public abstract class Produtos {
    private String nome;
    private String marca;
    private double precoProduto;
    private double PrecoVenda;

    //CONSTRUTOR:
    public Produtos(String nomeProduto, String marcaProduto ,double precodoproduto, double precoDaVenda){
        this.nome = nomeProduto;
        this.marca = marcaProduto;
        this.precoProduto = precodoproduto;
        this.PrecoVenda = precoDaVenda;
    }

    //GETS AND SETS:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public double getPrecoVenda() {
        return PrecoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        PrecoVenda = precoVenda;
    }
}
