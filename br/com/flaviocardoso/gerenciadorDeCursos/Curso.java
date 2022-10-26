package br.com.flaviocardoso.gerenciadorDeCursos;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet; // Não guarda a ordem de adicionada
import java.util.LinkedHashSet; // guarda a ordem adicionada
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Curso adiciona(Aula aula) {
		this.aulas.add(aula);
		return this;
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		String format = "[Curso: %s, tempo total: %s, aulas: %s]";
		return String.format(new Locale("PT", "BR"), format, nome, this.getTempoTotal(), this.getAulas());
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public Curso matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.geNumeroMatricula(), aluno);
		return this;
	}

	public boolean estaMatriculado(Aluno a1) {
		return alunos.contains(a1);
	}

	public Aluno buscaMatriculalado(int numero) {
		if (!this.matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
		return this.matriculaParaAluno.get(numero);
	}

}
