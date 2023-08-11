package com.example.sistemademercearia.Dados;

import com.example.sistemademercearia.exception.PerfilExistenteException;
import com.example.sistemademercearia.exception.PerfilNaoExistenteException;
import com.example.sistemademercearia.negocio.beans.Perfil;

import java.util.ArrayList;

public class RepositorioDePerfis {
    ArrayList <Perfil> perfisRep;

    //CONSTRUTOR:
    public RepositorioDePerfis(){
        this.perfisRep = new ArrayList<>();
    }

    //MÉTODOS:
    public void cadastrarPerfil(Perfil perfilX) throws PerfilExistenteException {
        if (!verificarPerfisIguais(perfilX)){
            perfisRep.add(perfilX);
            //EM CONSTRUÇÃO:

        }
        else {
        	throw new PerfilExistenteException();
        }
    }

    public void removerPerfil(Perfil perfilX) throws PerfilNaoExistenteException {
        if (!verificarPerfisIguais(perfilX)){
            perfisRep.remove(perfilX);

        }
        else {
        	throw new PerfilNaoExistenteException();
        }
    }

    public void alterarPerfil(Perfil perfilParaAlterar, String atributoSelecionado, String novoValor) {
        switch (atributoSelecionado.toLowerCase()) {
            case "nome":
                perfilParaAlterar.setNome(novoValor);
                break;
            case "senha":
                perfilParaAlterar.setSenha(novoValor);
                break;
        }
    }
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

    public ArrayList<Perfil> buscarPerfil(String nomePerfil) throws PerfilNaoExistenteException {
        ArrayList<Perfil> perfisEncontrados = new ArrayList<>();

        for (Perfil perfil: perfisRep) {
            if (perfil.getNome().toLowerCase().contains(nomePerfil.toLowerCase())) {
                perfisEncontrados.add(perfil);
            }
        }

        if (perfisEncontrados.isEmpty()) {
            throw new PerfilNaoExistenteException();
        }

        return perfisEncontrados;
    }

    //GET:
    public ArrayList <Perfil> getPerfisRep() {
        return perfisRep;
    }
}
