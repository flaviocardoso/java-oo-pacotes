package br.com.flaviocardoso.gerenciadorDeCursos;

import java.util.Locale;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int geNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		String format = "[Aluno: %s, matricula: %s]";
		return String.format(new Locale("PT", "BR"), format, nome, numeroMatricula);
	}
	
	/*
	 * Quando implementar equals, precisa implementar o hashCode.
	 * Nesse caso está verificando pelo nome do aluno.
	 */
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.nome.equals(a.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
