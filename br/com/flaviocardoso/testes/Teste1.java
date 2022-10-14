package br.com.flaviocardoso.testes;

import br.com.flaviocardoso.modelo.Guardador;

public class Teste1 {
	public static void main(String[] args) {
		Guardador gg = new Guardador();
		
		Object ob1 = new Object();
		gg.adiciona(ob1);
		
		Object ob2 = new Object();
		gg.adiciona(ob2);
		
		int tamanho = gg.getQuantidadeElementos();
		
		Object ref = gg.getReferncia(1);
		
		System.out.println("Objeto 1: " + ob1);
		System.out.println("Objeto 2: " + ob2);
		System.out.println(tamanho);
		System.out.println(ref);
	}
}
