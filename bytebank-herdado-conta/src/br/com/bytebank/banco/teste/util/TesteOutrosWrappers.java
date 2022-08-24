package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
	
		Number refNumero = Integer.valueOf(29);
		System.out.println(refNumero);
		Integer num = Integer.valueOf(259);
		System.out.println(Integer.BYTES);
		
		
		int quaoTop = 265;
		
		 for (int i = num; i <= quaoTop ; i++) {
			 System.out.print("\n");
			 System.out.println("Esse número é tão top que será repetido " + (quaoTop-num) + " vezes: " + num +"\n");
		}
		 
		Number refFloat = Float.valueOf(29.95f);
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(Integer.valueOf(10));
		lista.add(Integer.valueOf(quaoTop));
		lista.add(refFloat);
		
			
		for(Object Number : lista) {
			System.out.println(Number);
		}
	
	
	}
	

}
