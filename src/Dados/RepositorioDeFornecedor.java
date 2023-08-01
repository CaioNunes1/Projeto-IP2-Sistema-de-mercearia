package Dados;

import Negocio.seeds.Fornecedor;

import java.util.ArrayList;

public class RepositorioDeFornecedor {
    ArrayList <Fornecedor> fornecedorRep;

    //CONSTRUTOR:
    public RepositorioDeFornecedor() {
        this.fornecedorRep = new ArrayList<>();
    }

    public boolean verificarFornecedoresIguais(Fornecedor fornecedorX){
        boolean fornecedorJaExistente = false;

        for (int i = 0; i < getFornecedorRep().size() && !fornecedorJaExistente; i++){
            Fornecedor fornecedor = fornecedorRep.get(i);

            if (fornecedorX.equals(fornecedor)){
                fornecedorJaExistente = true;
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
            //EM CONSTRUÇÃO:
        }
    }

    public void removerPerfil(Fornecedor fornecedorX){

        if (!verificarFornecedoresIguais(fornecedorX)){
            fornecedorRep.remove(fornecedorX);
            //EM CONSTRUÇÃO:

        }
        else {
            //EM CONSTRUÇÃO:
        }
    }

    public void alterarPerfil (Fornecedor fornecedorX){

        if(!verificarFornecedoresIguais(fornecedorX)){
            //EM CONSTRUÇÃO:
        }
        else{
            //EM CONSTRUÇÃO:
        }
    }
    //GET:
    public ArrayList<Fornecedor> getFornecedorRep() {
        return fornecedorRep;
    }
}