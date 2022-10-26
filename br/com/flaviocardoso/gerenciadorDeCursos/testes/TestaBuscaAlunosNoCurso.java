package br.com.flaviocardoso.gerenciadorDeCursos.testes;

import java.util.Map;
import java.util.Set;

import br.com.flaviocardoso.gerenciadorDeCursos.Aluno;
import br.com.flaviocardoso.gerenciadorDeCursos.Aula;
import br.com.flaviocardoso.gerenciadorDeCursos.Curso;

public class TestaBuscaAlunosNoCurso {
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
		
		System.out.println("Quem é o aluno com matricula 43434?");
		Aluno aluno = curso.buscaMatriculalado(43434);
		System.out.println("aluno : " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos;
	}
}
