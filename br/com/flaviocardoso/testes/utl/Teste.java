package br.com.flaviocardoso.testes.utl;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Object> lista = new ArrayList<Object>();
		
		Object ob1 = new Object();
		lista.add(ob1);
		
		Object ob2 = new Object();
		lista.add(ob2);
		
		System.out.println("Object 1: " + ob1);
		System.out.println("Object 2: " + ob2);
		System.out.println("Tamanho: " + lista.size());
		System.out.println("Referencia 1: " + lista.get(0));
		
		System.out.println("Loop for.");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Object " + (i + 1) + ": " + lista.get(i));
		}
		
		System.out.println("Loop para lista");
		for(Object aRef : lista) {
			System.out.println(aRef);
		}
		
		lista.remove(0);
		System.out.println("Tamanho atualizado: " + lista.size());
		
	}
}
