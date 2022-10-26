package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import br.com.flaviocardoso.gerenciadorDeCursos.Aluno;
import br.com.flaviocardoso.gerenciadorDeCursos.Aula;
import br.com.flaviocardoso.gerenciadorDeCursos.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "Paulo");
		curso
			.adiciona(new Aula("Trabalhando com ArrayList", 23))
			.adiciona(new Aula("Criando uma Aula", 24))
			.adiciona(new Aula("Modelando com coleções", 27));
		
		Aluno a1 = new Aluno("Rodrigo", 334455);
		Aluno a2 = new Aluno("Guilherme", 43434);
		Aluno a3 = new Aluno("Mauricio", 399999);
		
		System.out.println("-- Alunos matriculados no curso --");
		curso
			.matricular(a1)
			.matricular(a2)
			.matricular(a3);
		
		curso.getAlunos().forEach(a -> System.out.println(a));
		System.out.println();
		
		System.out.println("Aluno " + a1.getNome() + " está matriculado? " + (curso.estaMatriculado(a1) ? "Sim" : "Não"));
		
		String nome = "Mauricio";
		System.out.println("-- Verificando se aluno é o mesmo --");
		System.out.println("-- Foi necessário implementar equals e hashCode no Aluno --");
		System.out.println("-- Foi implementado o hashCode por nome, "
				+ "mesmo trocando para uma matricula diferente continua igual --");
		System.out.println(curso.estaMatriculado(new Aluno(nome, 399999))); // verifica se contem o aluno na tabela hashset
	}
}
