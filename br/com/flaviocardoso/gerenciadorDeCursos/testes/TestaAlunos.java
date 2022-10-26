package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Flavio Cardoso");
		alunos.add("Juliana");
		alunos.add("Wagner");
		alunos.add("Tiago");
		alunos.add("Flavio Cardoso");
		alunos.add("Flavio Cardoso");
		alunos.add("Flavio Cardoso");
		alunos.add("Flavio Cardoso");
		
		// elementos não são repitidos
		System.out.println("-- qtd. alunos --");
		System.out.println(alunos.size());
		System.out.println();
		System.out.println("-- listar alunos --");
		alunos.forEach(a -> System.out.println(a));
		System.out.println();
		
		System.out.println("-- Contém Tigo --");
		String a1 = "Tiago";
		boolean tiagoContem = alunos.contains(a1);
		System.out.println(tiagoContem);
		System.out.println();
		
		System.out.println("-- remove Tiago --");
		alunos.remove(a1);
		System.out.println();
		System.out.println("-- listar alunos --");
		alunos.forEach(a -> System.out.println(a));
		System.out.println();
	}
}
