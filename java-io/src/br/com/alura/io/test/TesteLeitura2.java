package br.com.alura.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while( scanner.hasNextLine()) {
		
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			System.out.format(new Locale("en", "US") ,"%s - %04d-%08d, %20s: %8.2f %n",
														tipoConta, agencia, numeroConta, titular, saldo);
						
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		scanner.close();
		
	}

}
