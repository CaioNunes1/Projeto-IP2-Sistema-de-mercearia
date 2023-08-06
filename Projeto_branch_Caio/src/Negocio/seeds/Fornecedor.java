package Negocio.seeds;

public class Fornecedor {
    private String nome;
    private String empresa;

    //CONSTRUTOR:
    public Fornecedor(String nomeFornecedor, String empresaFornecedor) {
        this.nome = nomeFornecedor;
        this.empresa = empresaFornecedor;
    }

    //GETS AND SETS:
     public String getNome() {
            return nome;
    }
    public void setNome(String nomeFornecedor) {
        this.nome = nome;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresafornecedor) {
        this.empresa = empresa;
    }
}
