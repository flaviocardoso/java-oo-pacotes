package br.com.flaviocardoso.gerenciadorDeCursos;

import java.util.Locale;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public String toString() {
		String formato = "[Aula: %s, Duração: %d minutos]";
		return String.format(new Locale("PT", "BR"), formato, titulo, tempo);
	}

	@Override
	public int compareTo(Aula b) {
		return titulo.compareTo(b.titulo);
	}

	
}
