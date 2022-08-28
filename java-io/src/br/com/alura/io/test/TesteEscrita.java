package br.com.alura.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("output.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		bw.write("Testing out this writer...This is the first line");
		bw.newLine();
		bw.newLine();
		bw.write("This is our second line");
		
			
		
		bw.close();
		
	}

}
