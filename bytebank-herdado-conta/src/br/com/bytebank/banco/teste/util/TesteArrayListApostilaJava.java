package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListApostilaJava {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Marcos Alberto");
		
		List<Object> lista = new ArrayList<>();
		
		lista.add(cliente);
		lista.add("Marcinha");
		lista.add("Chester");
		lista.add("Banguela");
		
	
	}

}
