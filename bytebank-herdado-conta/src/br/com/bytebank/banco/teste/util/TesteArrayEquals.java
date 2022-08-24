package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayEquals {

	public static void main(String[] args) {
		
//		Conta cc = new ContaCorrente(22, 11);
//		Conta cp = new ContaPoupanca(22, 11);
//		
//		boolean igual = cc.ehIgual(cp);
//		System.out.println(igual);

				
		//Generics existem para não misturar os tipos, código mais tipado
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(22, 11);
		lista.add(cp);
		
		Conta cp1 = new ContaPoupanca(22, 11);
//		lista.add(cp1);

		boolean exist = lista.contains(cp1);
		
		System.out.println("Já existe? " + exist);
		
		for(Conta conta : lista) {
			if(conta.equals(cp1)) {
				System.out.println("Essa conta já foi registrada!");
			}
		}
		
		for(Object Conta : lista) {
			System.out.println(Conta);
		}
	
	}

}
