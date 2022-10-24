package br.com.flaviocardoso.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaFileWriter {
	public static void main(String[] args) {
		// fluxo de entrada com arquivo
		
		try {
//			FileWriter fw = new FileWriter("lorem2.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
			
			String linha = "Escrevendo uma nova linha1-!!!";
			String linha2 = "Testando a segunda linha2!!!";
			bw.write(linha);
//			fw.write(System.lineSeparator()); \r\n
			bw.newLine();
			bw.write(linha2);
//			fw.write(System.lineSeparator()); \r\n
			bw.newLine();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
