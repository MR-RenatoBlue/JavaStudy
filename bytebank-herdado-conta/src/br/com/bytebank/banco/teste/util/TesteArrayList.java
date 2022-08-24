package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics existem para não misturar os tipos, código mais tipado
		List<Conta> lista = new Vector<Conta>();
		
		
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
		lista.add(cc1);
		
		Conta cp1 = new ContaPoupanca(22, 11);
		lista.add(cp1);
		
		
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
