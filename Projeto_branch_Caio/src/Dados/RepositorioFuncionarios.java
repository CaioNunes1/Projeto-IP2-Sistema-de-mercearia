package Dados;

import Negocio.Excecoes_Repositorio;
import Negocio.seeds.Funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarios {
    ArrayList<Funcionario> funcionarioRep;

    //CONSTRUTOR:
    public RepositorioFuncionarios() {
        this.funcionarioRep = new ArrayList<Funcionario>();
    }

    //MÉTODOS:
    public boolean verificarFuncionariosIguais(Funcionario funcionarioX){
        boolean funcionarioJaExistente = false;

        for (int i = 0; i < getFuncionarioRep().size() && !funcionarioJaExistente; i++){
            Funcionario funcionario = funcionarioRep.get(i);

            if (funcionarioX.equals(funcionario)){
                funcionarioJaExistente = true;
                break;
            }
        }
        return funcionarioJaExistente;
    }

    public void cadastrarPerfil(Funcionario funcionarioX){

        if (!verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.add(funcionarioX);
        }
        else {
        	throw Excecoes_Repositorio.funcionarioExistente();
        }
    }

    public void removerPerfil(Funcionario funcionarioX){

        if (verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.remove(funcionarioX);
        }
        else {
        	throw Excecoes_Repositorio.funcionarioNaoExistente();
        }
    }

    public void alterarPerfil (Funcionario funcionarioX){

        if(verificarFuncionariosIguais(funcionarioX)){
            //EM CONSTRUÇÃO: 
        }
        else{
        	throw Excecoes_Repositorio.funcionarioNaoExistente();
        }
    }

    //GET:
    public ArrayList <Funcionario> getFuncionarioRep() {
        return funcionarioRep;
    }
}
