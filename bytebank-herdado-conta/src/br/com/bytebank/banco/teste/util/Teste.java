package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(22, 11);
		lista.add(cp);
		

		System.out.println("Tamanho atual: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho atual: " + lista.size());
	
	
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cp1 = new ContaPoupanca(22, 11);
		lista.add(cp);
		
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------------------------------------------");
		
		for(Object Conta : lista) {
			System.out.println(Conta);
		}
	
	}

}
