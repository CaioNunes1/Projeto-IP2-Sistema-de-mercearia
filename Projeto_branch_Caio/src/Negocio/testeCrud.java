package Projeto_branch_Caio.src.Negocio;

import Projeto_branch_Caio.src.Dados.*;
import Projeto_branch_Caio.src.Negocio.seeds.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class testeCrud {

    public static void main(String[]args){
        //ADICIONANDO FORNECEDORES
        System.out.println("Imprimindo fornecedores");
        Fornecedor fornecedor =new Fornecedor("João Paulo","EmpresaX");
        Fornecedor fornecedor2 =new Fornecedor("Rafael","Maçãs Ruralinda");
        RepositorioDeFornecedor repFornecedor=new RepositorioDeFornecedor();
        repFornecedor.cadastrarPerfil(fornecedor);
        repFornecedor.cadastrarPerfil(fornecedor2);
        System.out.println(repFornecedor.getFornecedorRep());
        System.out.println("\n");


        //ADICIONANDO PERFIS E FUNCIONARIO
        System.out.println("Imprimindo funcionarios e perfis\n");
        LocalDate dataNascimento1= LocalDate.of(1995,4,23);
        Funcionario funcionario = new Funcionario("Joao", 444333444,dataNascimento1 ,
                "Recife-Pernambuco", "Funcionario");//pode exister funcionario comum e
        //gerente/administrador
        LocalDate dataNascimento2= LocalDate.of(1985,2,10);
        Funcionario funcionario2 = new Funcionario("Maria", 555666222,dataNascimento2 ,
                "Recife-Pernambuco", "Gerente");

        RepositorioFuncionarios repFuncionario=new RepositorioFuncionarios();
        repFuncionario.cadastrarPerfil(funcionario);
        repFuncionario.cadastrarPerfil(funcionario2);
        System.out.println("Imprimindo funcionarios");
        System.out.println(repFuncionario.getFuncionarioRep());
        System.out.println("\n");

        System.out.println("Imprimindo perfis");
        Perfil perfil=new Perfil("Joao","111222333",funcionario);
        Perfil perfil2=new Perfil("Maria","admin",funcionario2);
        RepositorioDePerfis repPerfis=new RepositorioDePerfis();
        repPerfis.cadastrarPerfil(perfil);
        repPerfis.cadastrarPerfil(perfil2);
        System.out.println(repPerfis.getPerfisRep());
        System.out.println("\n");

        //ADICIONANDO PRODUTOS E VENDA
        System.out.println("Adicionando produtos");
        ProdutosVendidosPorUnidade prod1=new ProdutosVendidosPorUnidade("shampoo","pantene",5.00,
                7.00,fornecedor,2);
        RepositorioDeProdutos repProd= new RepositorioDeProdutos();
        repProd.cadastrarProduto(prod1);
        ProdutosVendidosPorPeso prod2=new ProdutosVendidosPorPeso("Maçã","Maçãs Ruralinda",5,6.5,
                fornecedor2,4);
        repProd.cadastrarProduto(prod2);
        System.out.println(repProd.getProdutosRep());
        System.out.println("\n");

        //VENDA
        System.out.println("Adicionando vendas");
        ArrayList<Produtos> prodVenda=new ArrayList<>();
        prodVenda.add(prod1);
        prodVenda.add(prod2);
        LocalDateTime dataVenda=LocalDateTime.now();
        Vendas venda=new Vendas(dataVenda,prodVenda, perfil.getNome());

        System.out.println(venda);
        //
        System.out.println("\n");

    }
}
