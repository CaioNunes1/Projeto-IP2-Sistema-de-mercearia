package Negocio.seeds;

import java.util.ArrayList;

public class Estabelecimento {
    public String nome;
    public String Endereco;
    public String categoria;
    public ArrayList <String> nomesDosDonos;

    //CONSTRUTOR:
    public Estabelecimento (String nomeEstabelecimento, String enderecoEstabelecimento, String categoriaEstabelecimento){
        this.nome = nomeEstabelecimento;
        this.Endereco = enderecoEstabelecimento;
        this.categoria = categoriaEstabelecimento;
    }

    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nomesDosDonos=" + nomesDosDonos +
                '}';
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
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoriaEstabelecimento) {
        this.categoria = categoriaEstabelecimento;
    }
    public ArrayList<String> getNomesDosDonos() {
        return nomesDosDonos;
    }
    public void setNomesDosDonos(ArrayList<String> nomesDosDonos) {
        this.nomesDosDonos = nomesDosDonos;
    }
}
