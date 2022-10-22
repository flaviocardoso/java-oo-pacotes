package br.com.flaviocardoso.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) {
		// fluxo de entrada com arquivo
		
		try {
			InputStream fis = new FileInputStream("lorem.txt"); //entrada
			Reader isr = new InputStreamReader(fis); // leitura
			// É um Reader, mas com Reader não possui os métodos para a execução do buffer 
			BufferedReader br = new BufferedReader(isr); // leitura buffer
			
			Boolean le = br.ready(); // pronto para ler
			System.out.println(le);
			int i = br.read(); // lê caracter
			System.out.println((char )i);
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();			
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
