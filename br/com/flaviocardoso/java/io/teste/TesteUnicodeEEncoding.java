package br.com.flaviocardoso.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "Cç";
		// unicode
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + ", UTF-8");
		String sNovo = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		sNovo = new String(bytes, StandardCharsets.UTF_16);
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		sNovo = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(sNovo);
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13˚ Órgão Oficial";
		byte[] bytesS1 = s1.getBytes(utf8);
		String s2 = new String(bytesS1, utf8);
		System.out.println(s1); // charset padrão já é UTF-8
		System.out.println(s2);
	}
}
