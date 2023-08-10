package Projeto_branch_Caio.src.Dados;

import Negocio.Excecoes_Repositorio;
import Projeto_branch_Caio.src.Negocio.seeds.Produtos;

import java.util.ArrayList;
import java.util.List;

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
    
    public List<Produtos> existeProdutoPorNome(String nome) {
    	List<Produtos> prodContemNome=new ArrayList<Produtos>();
    	
    	for(Produtos p:produtosRep) {
    		if(p.getNome().contains(nome)) {
    			prodContemNome.add(p);
    		}
    	}
    	
    	return prodContemNome;
    }
    
    public Produtos ProdNomeParaAdicionarNoCarrinho(String nome,String marca) {

    	for(Produtos p:produtosRep) {
    		 if(p.getNome().equalsIgnoreCase(nome) && p.getMarca().equalsIgnoreCase(marca)){
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