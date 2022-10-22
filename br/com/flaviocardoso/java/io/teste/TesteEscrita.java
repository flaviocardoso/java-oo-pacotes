package br.com.flaviocardoso.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) {
		// fluxo de entrada com arquivo
		
		try {
			OutputStream fis = new FileOutputStream("lorem2.txt"); //entrada
			Writer isr = new OutputStreamWriter(fis); // escrita
			// É um Writer, mas com writer não possui os métodos para a execução do buffer 
			BufferedWriter br = new BufferedWriter(isr); // escrita buffer
			
			String linha = "Escrevendo uma nova linha!!!";
			String linha2 = "Testando a segunda linha!!!";
			br.write(linha);
//			br.newLine();
			br.newLine();
			br.write(linha2);
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
