package Projeto_branch_Caio.src.Dados;

import Negocio.Excecoes_Repositorio;
import Projeto_branch_Caio.src.Negocio.seeds.Perfil;

import java.util.ArrayList;

public class RepositorioDePerfis {
    ArrayList <Perfil> perfisRep;

    //CONSTRUTOR:
    public RepositorioDePerfis(){
        this.perfisRep = new ArrayList<>();
    }

    //MÉTODOS:
    public boolean verificarPerfisIguais(Perfil perfilX){
        boolean perfilJaExistente = false;

        for (int i = 0; i < perfisRep.size() && !perfilJaExistente; i++){
            Perfil perfil = perfisRep.get(i);

            if (perfilX.getNome().equals(perfil.getNome()) && perfilX.getSenha().equals(perfil.getSenha())){
                perfilJaExistente = true;
                break;
            }
        }
        return perfilJaExistente;
    }

    public void cadastrarPerfil(Perfil perfilX){
        if (!verificarPerfisIguais(perfilX)){
            perfisRep.add(perfilX);
            //EM CONSTRUÇÃO:

        }
        else {
        	throw Excecoes_Repositorio.perfilExistente();
        }
    }

    public void removerPerfil(Perfil perfilX){
        if (!verificarPerfisIguais(perfilX)){
            perfisRep.remove(perfilX);
            
        }
        else {
        	throw Excecoes_Repositorio.perfilNaoExistente();
        }
    }

    public void alterarPerfil (Perfil perfilX){
        if(verificarPerfisIguais(perfilX)){
            //EM CONSTRUÇÃO:
        }
        else{
        	throw Excecoes_Repositorio.perfilNaoExistente();
        }
    }

    //GET:
    public ArrayList <Perfil> getPerfisRep() {
        return perfisRep;
    }
    public boolean equals(Object perfil) {
    	
    	return false;
    }
}