package Dados;

import Negocio.seeds.Produtos;

import java.util.ArrayList;

public class RepositorioDeProdutos {
    ArrayList <Produtos> produtosRep;

    //CONSTRUTOR:
    public RepositorioDeProdutos(){
        this.produtosRep = new ArrayList<>();
    }


    //MÉTODOS:
    public boolean verificarProdutosIguais(Produtos produtoX){
        boolean produtoJaExistente = false;

        for (int i = 0; i < produtosRep.size() && !produtoJaExistente; i++){
            Produtos produto = produtosRep.get(i);

            if (produtoX.equals(produto)){
                produtoJaExistente = true;
            }
        }
        return produtoJaExistente;
    }

    public void cadastrarPerfil(Produtos produtoX){
        if (!verificarProdutosIguais(produtoX)){
            produtosRep.add(produtoX);
            //EM CONSTRUÇÃO:

        }
        else {
            //EM CONSTRUÇÃO:
        }
    }

    public void removerPerfil(Produtos produtoX){
        if (!verificarProdutosIguais(produtoX)){
            produtosRep.remove(produtoX);
            //EM CONSTRUÇÃO:

        }
        else {
            //EM CONSTRUÇÃO:
        }
    }

    public void alterarPerfil (Produtos produtoX){
        if(!verificarProdutosIguais(produtoX)){
            //EM CONSTRUÇÃO:
        }
        else{
            //EM CONSTRUÇÃO:
        }
    }

    //GET:
    public ArrayList <Produtos> getProdutosRep() {
        return produtosRep;
    }
}