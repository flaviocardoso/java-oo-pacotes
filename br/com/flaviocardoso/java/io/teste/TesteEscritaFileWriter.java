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
//			BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
			
			
//			PrintStream ps = new PrintStream("lorem2.txt");
//			PrintStream ps = new PrintStream(new File("lorem2.txt"));
			PrintWriter ps = new PrintWriter("lorem2.txt");
			
			String linha = "Escrevendo  jsjkj uma nova linha1-qws!!!";
			String linha2 = "Testando a segunda ksksksn linha2!!!";
			
			ps.println(linha);
			ps.println();
			ps.println(linha2);
			ps.close();
			
//			bw.write(linha);
////			fw.write(System.lineSeparator()); \r\n
//			bw.newLine();
//			bw.write(linha2);
////			fw.write(System.lineSeparator()); \r\n
//			bw.newLine();
//			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
