package br.com.flaviocardoso.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {
	public static void main(String[] args) {
		// fluxo de entrada com arquivo
		
		try {
			Socket s = new Socket();
			
//			InputStream fis = new FileInputStream("lorem.txt"); // entrada arquivo
			InputStream fis = System.in; // entrada teclado
//			InputStream fis = s.getInputStream(); // entrada rede
			Reader isr = new InputStreamReader(fis); // leitura
			BufferedReader br = new BufferedReader(isr); // leitura buffer
			
			OutputStream fos = new FileOutputStream("lorem2.txt"); // saida arquivo
//			OutputStream fos = System.out; // saida console
//			OutputStream fos = s.getOutputStream(); // saida rede
			Writer isw = new OutputStreamWriter(fos); // escrita
			// É um Writer, mas com Writer não possui os métodos para a execução do buffer 
			BufferedWriter bw = new BufferedWriter(isw); // escrita buffer
			
			String linha = br.readLine();
			
			while(linha != null && !linha.isEmpty()) {
				bw.write(linha);
				bw.newLine();
				bw.flush();
//				System.out.print(linha);
				linha = br.readLine();
			}
			
			bw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
