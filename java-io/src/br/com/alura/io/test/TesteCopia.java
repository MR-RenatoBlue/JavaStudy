package br.com.alura.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopia {

	public static void main(String[] args) throws Exception {

		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		

		OutputStream fos = new FileOutputStream("output.html");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();
			
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
			
		br.close();
		bw.close();
		
	}

}
//<meta http-equiv="refresh" content="5; URL=file:///home/mrblue/Projects/java/java-io/output.html">
