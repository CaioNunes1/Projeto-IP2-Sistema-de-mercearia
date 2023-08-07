package Dados;

import Negocio.Excecoes_Repositorio;
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

            if (produtoX.getNome().equals(produto.getNome())&& produtoX.getMarca().equals(produto.getMarca())){
                produtoJaExistente = true;
                break;
            }
        }
        return produtoJaExistente;
    }
    
    public Produtos existeProdutoPorNomeEMarca(String nome,String marca) {
    	for(Produtos p:produtosRep) {
    		if(p.getMarca().equalsIgnoreCase(marca)&& p.getNome().equals(nome)) {
    			return p;
    		}
    	}
    	return null;
    }

    public void cadastrarProduto(Produtos produtoX)  { 
    	
    		if (!verificarProdutosIguais(produtoX)){
                produtosRep.add(produtoX);
                
            }
    		else {
    			throw Excecoes_Repositorio.produtoExistente();
    		}	
    }

    public void removerProduto(Produtos produtoX)  {
        if (verificarProdutosIguais(produtoX)){
            produtosRep.remove(produtoX);

        }
        else {
        	throw Excecoes_Repositorio.produtoNaoExistente();
        }
    }

    public void alterarProduto(Produtos produtoX){
        if(verificarProdutosIguais(produtoX)){
        	
        }
        else{
        	throw Excecoes_Repositorio.produtoNaoExistente();
        }
    }

    //GET:
    public ArrayList <Produtos> getProdutosRep() {
        return produtosRep;
    }
}