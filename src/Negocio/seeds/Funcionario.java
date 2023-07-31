package Negocio.seeds;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private int cpf;
    private LocalDate DataDeNascimento;
    private String Endereco;
    private String categoria;

    //CONSTRUTOR:
    public Funcionario(String nomeFuncionario, int cpfFuncionario ,LocalDate dataDeNasc, String enderecoFuncioario, String cagetoriaFuncionario) {
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
    public int getCpf(){
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
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
