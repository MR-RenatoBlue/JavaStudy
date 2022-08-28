package br.com.alura.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws Exception {

		//Fluxo de entrada com um arquivo (input.txt)
		//Esse código é potencialmente perigoso por não ser garantido que o arquivo estará disponível
		InputStream fis = new FileInputStream("input.txt");
		
		/*Esse 'isr' sabe ler um inputStream como o 'fis'*/
		Reader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
			
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
			
		br.close();
		
	}

}
