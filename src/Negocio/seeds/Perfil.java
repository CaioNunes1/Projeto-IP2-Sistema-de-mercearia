package Negocio.seeds;

public class Perfil {
    private String nome;
    private String senha;
    private Funcionario usuario;

    //CONSTRUTOR:
    public Perfil(String nomePerfil, String senhaPerfil, Funcionario usuarioPerfil){
        this.nome = nomePerfil;
        this.senha = senhaPerfil;
        this.usuario = usuarioPerfil;
    }

    //GETS AND SETS:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Funcionario getUsuario() {
        return usuario;
    }
}
