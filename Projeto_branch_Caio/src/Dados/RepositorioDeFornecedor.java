package Dados;

import Negocio.Excecoes_Repositorio;
import Negocio.seeds.Fornecedor;

import java.util.ArrayList;

public class RepositorioDeFornecedor {
    ArrayList <Fornecedor> fornecedorRep;

    //CONSTRUTOR:
    public RepositorioDeFornecedor() {
        this.fornecedorRep = new ArrayList<>();
    }

    //MÉTODOS:
    public boolean verificarFornecedoresIguais(Fornecedor fornecedorX){
        boolean fornecedorJaExistente = false;

        for (int i = 0; i < getFornecedorRep().size() && !fornecedorJaExistente; i++){
            Fornecedor fornecedor = fornecedorRep.get(i);

            if (fornecedorX.equals(fornecedor)){
                fornecedorJaExistente = true;
                break;
            }
        }
        return fornecedorJaExistente;
    }

    public void cadastrarPerfil(Fornecedor fornecedorX){

        if (!verificarFornecedoresIguais(fornecedorX)){
            fornecedorRep.add(fornecedorX);
            //EM CONSTRUÇÃO:

        }
        else {
        	throw Excecoes_Repositorio.perfilExistente();
        }
    }

    public void removerPerfil(Fornecedor fornecedorX){

        if (!verificarFornecedoresIguais(fornecedorX)){
            fornecedorRep.remove(fornecedorX);
            //EM CONSTRUÇÃO:

        }
        else {
        	throw Excecoes_Repositorio.perfilNaoExistente();
        }
    }

    public void alterarPerfil (Fornecedor fornecedorX){

        if(verificarFornecedoresIguais(fornecedorX)){
            //EM CONSTRUÇÃO:
        }
        else{
        	throw Excecoes_Repositorio.perfilNaoExistente();
        }
    }
    //GET:
    public ArrayList<Fornecedor> getFornecedorRep() {
        return fornecedorRep;
    }
}