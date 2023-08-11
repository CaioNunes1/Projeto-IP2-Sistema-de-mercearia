package com.example.sistemademercearia.Dados;

import com.example.sistemademercearia.exception.FuncionarioExistenteException;
import com.example.sistemademercearia.exception.FuncionarioNaoExistenteException;
import com.example.sistemademercearia.negocio.beans.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioFuncionarios {
    ArrayList <Funcionario> funcionarioRep;

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

    public void cadastrarFuncionario(Funcionario funcionarioX) throws FuncionarioExistenteException {

        if (!verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.add(funcionarioX);
        }
        else {
        	throw new FuncionarioExistenteException();
        }
    }

    public void removerFuncionario(Funcionario funcionarioX) throws FuncionarioNaoExistenteException {

        if (verificarFuncionariosIguais(funcionarioX)){
            funcionarioRep.remove(funcionarioX);
        }
        else {
        	throw new FuncionarioNaoExistenteException();
        }
    }

    public void alterarFuncionario(Funcionario funcionarioParaAlterar, String atributoSelecionado, String novoValor) {
        switch (atributoSelecionado.toLowerCase()) {
            case "nome":
                funcionarioParaAlterar.setNome(novoValor);
                break;
            case "cpf":
                funcionarioParaAlterar.setCpf(novoValor);
                break;
            case "endereco":
                funcionarioParaAlterar.setEndereco(novoValor);
                break;
            case "cargo":
                funcionarioParaAlterar.setCargo(novoValor);
                break;
            case "datadenascimento":
                LocalDate dataNascimento = LocalDate.parse(novoValor);
                funcionarioParaAlterar.setDataDeNascimento(dataNascimento);
                break;
        }
    }

    //GET:
    public ArrayList <Funcionario> getFuncionarioRep() {
        return funcionarioRep;
    }
}