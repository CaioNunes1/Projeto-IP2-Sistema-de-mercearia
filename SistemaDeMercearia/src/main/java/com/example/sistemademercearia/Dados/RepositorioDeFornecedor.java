package com.example.sistemademercearia.Dados;


import com.example.sistemademercearia.exception.FornecedorExistenteException;
import com.example.sistemademercearia.exception.FornecedorNaoExistenteException;
import com.example.sistemademercearia.negocio.beans.Fornecedor;


import java.util.ArrayList;

public class RepositorioDeFornecedor {
    ArrayList<Fornecedor> fornecedorRep;

    //CONSTRUTOR:
    public RepositorioDeFornecedor() {
        this.fornecedorRep = new ArrayList<>();
    }

    //MÉTODOS:
        public void cadastrarFornecedor (Fornecedor fornecedorX) throws FornecedorExistenteException {

            if (!verificarFornecedoresIguais(fornecedorX)) {
                fornecedorRep.add(fornecedorX);
            } else {
                throw new FornecedorExistenteException();
            }
        }

        public void removerFornecedor (Fornecedor fornecedorX) throws FornecedorNaoExistenteException {

            if (!verificarFornecedoresIguais(fornecedorX)) {
                fornecedorRep.remove(fornecedorX);

            } else {
                throw new FornecedorNaoExistenteException();
            }
        }

    public void alterarFornecedor(Fornecedor fornecedorParaAlterar, String atributoSelecionado, String novoValor){
            switch (atributoSelecionado.toLowerCase()) {
                case "nome":
                    fornecedorParaAlterar.setNome(novoValor);
                    break;
                case "empresa":
                    fornecedorParaAlterar.setEmpresa(novoValor);
                    break;

            }
    }

    public boolean verificarFornecedoresIguais(Fornecedor fornecedorX) {
        boolean fornecedorJaExistente = false;

        for (int i = 0; i < getFornecedorRep().size() && !fornecedorJaExistente; i++) {
            Fornecedor fornecedor = fornecedorRep.get(i);

            if (fornecedorX.equals(fornecedor)) {
                fornecedorJaExistente = true;
                break;
            }
        }
        return fornecedorJaExistente;
    }

    public ArrayList<Fornecedor> buscarFornecedor (String nomeFornecedor) throws FornecedorNaoExistenteException{
        ArrayList<Fornecedor> fornecededoresEncontrados = new ArrayList<>();

        for (Fornecedor fornecedor : fornecedorRep) {
            if (fornecedor.getNome().toLowerCase().contains(nomeFornecedor.toLowerCase())) {
                fornecededoresEncontrados.add(fornecedor);
            }
        }

        if (fornecededoresEncontrados.isEmpty()) {
            throw new FornecedorNaoExistenteException();
        }

        return fornecededoresEncontrados;
    }

    //GET:
    public ArrayList<Fornecedor> getFornecedorRep() {
        return fornecedorRep;
    }
}

