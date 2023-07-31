package Dados;

import Negocio.seeds.Funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarios {
    ArrayList<Funcionario> funcionarioRep;

    //CONSTRUTOR:
    public RepositorioFuncionarios(ArrayList<Funcionario> funcionarioRep) {
        this.funcionarioRep = funcionarioRep;
    }

    //MÉTODOS:
    public boolean verificarFuncionariosIguais(Funcionario funcionarioX){
        boolean funcionarioJaExistente = false;

        for (int i = 0; i < getFuncionarioRep().size() && !funcionarioJaExistente; i++){
            Funcionario funcionario = funcionarioRep.get(i);

            if (funcionarioX.equals(funcionario)){
                funcionarioJaExistente = true;
            }
        }
        return funcionarioJaExistente;
    }

    public void cadastrarPerfil(Funcionario funcionarioX){

        if (!verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.add(funcionarioX);
            //EM CONSTRUÇÃO:

        }
        else {
            //EM CONSTRUÇÃO:
        }
    }

    public void removerPerfil(Funcionario funcionarioX){

        if (!verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.remove(funcionarioX);
            //EM CONSTRUÇÃO:

        }
        else {
            //EM CONSTRUÇÃO:
        }
    }

    public void alterarPerfil (Funcionario funcionarioX){

        if(!verificarFuncionariosIguais(funcionarioX)){
            //EM CONSTRUÇÃO:
        }
        else{
            //EM CONSTRUÇÃO:
        }
    }

    //GET:
    public ArrayList <Funcionario> getFuncionarioRep() {
        return funcionarioRep;
    }
}
