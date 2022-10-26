package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import java.util.LinkedList;
import java.util.List;

import br.com.flaviocardoso.gerenciadorDeCursos.Aula;
import br.com.flaviocardoso.gerenciadorDeCursos.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");
		
//		javaColecoes.getAulas().add(new Aula("2333", 23)); // Não pode ser modificado por add.
		javaColecoes
			.adiciona(new Aula("Trabalhando com ArrayList", 23))
			.adiciona(new Aula("Criando uma Aula", 24))
			.adiciona(new Aula("Modelando com coleções", 27));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulas = new LinkedList<>(aulasImutaveis);
		
		System.out.println("--- lista ---");
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println();
		System.out.println("-- ordem aula --");
		aulas.sort(null);
		
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		System.out.println("-- tempo total de aulas --");
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println();
		System.out.println("-- Curso --");
		
		System.out.println(javaColecoes);
		
	}
}
