package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String [] nomes = new String[5];
		
		
		int idade = 29; //Integer
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		
		
		int valor = idadeRef.intValue();
		
		String s = args[0]; //"10" 
		
		//Integer numero = Integer.valueOf(s); --> parsing
		
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing

	}

}
