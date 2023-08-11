package com.example.sistemademercearia.negocio.beans;

public class Mercearia {
    public String nome;
    public String Endereco;
    public Fornecedor fornecedores;
    private Funcionario funcionario;
  
    public Mercearia(String nome, String endereco, Fornecedor fornecedor, Funcionario funcionario) {
		super();
		this.nome = nome;
		Endereco = endereco;
		this.fornecedores= fornecedor;
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Mercearia [nome=" + nome + ", Endereco=" + Endereco + ", fornecedores=" + fornecedores
				+ ", funcionario=" + funcionario + "]";
	}

	//GETS AND SETS:
    public String getNome() {
        return nome;
    }
    public void setNome(String nomeEstabelecimento) {
        this.nome = nomeEstabelecimento;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String enderecoEstabelecimento) {
        Endereco = enderecoEstabelecimento;
    }

}