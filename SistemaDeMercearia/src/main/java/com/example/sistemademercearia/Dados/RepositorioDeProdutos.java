package com.example.sistemademercearia.Dados;

import java.util.ArrayList;
import com.example.sistemademercearia.exception.ProdutoExistenteException;
import com.example.sistemademercearia.exception.ProdutoNaoExistenteException;
import com.example.sistemademercearia.negocio.beans.Produto;

public class RepositorioDeProdutos {
    ArrayList <Produto> estoque;
    
    // CONSTRUTOR:
    public RepositorioDeProdutos() {
        this.estoque = new ArrayList<>();
    }

    // MÉTODOS:
    public void cadastrarProduto(Produto produtoX) throws ProdutoExistenteException {

        if (!verificarProdutoExistente(produtoX)){
            estoque.add(produtoX);
        }
        else {
            throw new ProdutoExistenteException();
        }
    }

    public void removerProduto(Produto produtoX) throws ProdutoNaoExistenteException {
        if (verificarProdutoExistente(produtoX)){
            estoque.remove(produtoX);
        }
        else {
            throw new ProdutoNaoExistenteException();
        }
    }

    public void alterarProduto(Produto produtoParaAlterar, String atributo, String novoValor) {
        switch (atributoSelecionado.toLowerCase()) {
            case "nome":
                produtoParaAlterar.setNome(novoValor);
                break;
            case "fabricante":
                produtoParaAlterar.setFabricante(novoValor);
                break;
            case "preço":
                double novoPreco = Double.parseDouble(novoValor);
                produtoParaAlterar.setPrecoVenda(novoPreco);
                break;
        }
    }

    public boolean verificarProdutoExistente(Produto produtoX){
        boolean produtoexiste = false;

        for (int i = 0; i < estoque.size() && !produtoexiste; i++){
            Produto produto = estoque.get(i);

            if (produtoX.getNome().equals(produto.getNome())
                    && produtoX.getFabricante().equals(produto.getFabricante())){
                produtoexiste = true;
                break;
            }
        }
        return produtoexiste;
    }
    public ArrayList<Produto> buscarProdutos(String nomeProduto) throws ProdutoNaoExistenteException {
        ArrayList<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : estoque) {
            if (produto.getNome().toLowerCase().contains(nomeProduto.toLowerCase())) {
                produtosEncontrados.add(produto);
            }
        }

        if (produtosEncontrados.isEmpty()) {
            throw new ProdutoNaoExistenteException();
        }

        return produtosEncontrados;
    }

    public void atualizarEstoque(Produto produtoSelecionado, double novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        produtoSelecionado.setQuantidadeOuPeso(novaQuantidade);
    }

    public double obterQuantidadeEstoque(Produto produto) {
        return produto.getQuantidadeOuPeso();
    }

    //GET:
    public ArrayList <Produto> getProdutosRep() {
        return estoque;
    }
}