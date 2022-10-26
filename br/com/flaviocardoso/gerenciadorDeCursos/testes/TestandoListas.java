package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("--- for each ---");
		aulas.forEach((aula) -> System.out.println(aula));
		System.out.println();
		System.out.println("--- remove primeiro item ---");
		aulas.remove(0);
		System.out.println("--- for each---");
		aulas.forEach((aula) -> System.out.println(aula));
		System.out.println();
		
		System.out.println("--- pegando a primeira aula ---");
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		System.out.println();
		
		System.out.println("--- pegando aulas pelo index ---");
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		System.out.println();
		
		System.out.println("--- for lista ---");
		for (String aula : aulas) {
			System.out.println(aula);
		}
		System.out.println();
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("--- antes de ordenado ---");
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println("--- ordenando aulas ---");
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
	}
}
