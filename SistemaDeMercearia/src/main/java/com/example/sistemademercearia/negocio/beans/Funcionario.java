package com.example.sistemademercearia.negocio.beans;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String cargo;
    private LocalDate DataDeNascimento;

    //CONSTRUTOR:
    public Funcionario(String nomeFuncionario, String cpfFuncionario, String enderecoFuncioario, String cagetoriaFuncionario, LocalDate dataDeNasc) {
        this.nome = nomeFuncionario;
        this.cpf = cpfFuncionario;
        this.endereco = enderecoFuncioario;
        this.cargo = cagetoriaFuncionario;
        this.DataDeNascimento = dataDeNasc;
    }

    //GETS AND SETS:
    public String getNomeFuncionario(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataDeNascimento() {
        return DataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }
    public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        endereco = endereco;
    }
}