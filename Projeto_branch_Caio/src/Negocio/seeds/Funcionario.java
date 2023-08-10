package Projeto_branch_Caio.src.Negocio.seeds;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private long cpf;
    private LocalDate DataDeNascimento;
    private String Endereco;
    private String categoria;

    //CONSTRUTOR:
    public Funcionario(String nomeFuncionario, long cpfFuncionario ,LocalDate dataDeNasc, String enderecoFuncioario, String cagetoriaFuncionario) {
        this.nome = nomeFuncionario;
        this.cpf = cpfFuncionario;
        this.DataDeNascimento = dataDeNasc;
        this.Endereco = enderecoFuncioario;
        this.categoria = cagetoriaFuncionario;
    }

    //GETS AND SETS:
    public String getNomeFuncionario(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf(){
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataDeNascimento() {
        return DataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }
    public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", DataDeNascimento=" + DataDeNascimento +
                ", Endereco='" + Endereco + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
