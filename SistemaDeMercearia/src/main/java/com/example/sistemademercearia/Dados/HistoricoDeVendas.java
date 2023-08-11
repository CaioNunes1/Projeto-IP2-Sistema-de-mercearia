package com.example.sistemademercearia.Dados;

import com.example.sistemademercearia.negocio.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDeVendas {

	List<SistemaDeVendas> vendas=new ArrayList<SistemaDeVendas>();
	public void adicionarVendasConcluidas() {

	}
	public void removerVendas() {

	}
	public List<SistemaDeVendas> listarHistoricoVendas(){
		return vendas;
	}

}
