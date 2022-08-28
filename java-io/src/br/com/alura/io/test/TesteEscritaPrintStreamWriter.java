package br.com.alura.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("output.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));
		
//		PrintStream ps = new PrintStream("lorem.txt");
		
		PrintWriter ps = new PrintWriter("lorem.txt");
		
		ps.println("Testing out this writer...This is the first line");
		ps.println();
		ps.println("This is our second line");
		
			
		
		ps.close();
		
	}

}
