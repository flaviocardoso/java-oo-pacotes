package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.flaviocardoso.gerenciadorDeCursos.Aula;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("3 - Revisando as ArrayLists", 21);
		Aula a2 = new Aula("1 - Lista de objetos", 15);
		Aula a3 = new Aula("6 - Relacionamento de listas e objetos", 17);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("--- ordenar por titulo pela lista ---");
//		aulas.sort((pa, pb) -> pa.getTitulo().compareTo(pb.getTitulo()));
//		aulas.forEach(aula -> System.out.println(aula));
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("--- ordenar por tempo pela lista ---");
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		aulas.forEach(aula -> System.out.println(aula));
	}
}
