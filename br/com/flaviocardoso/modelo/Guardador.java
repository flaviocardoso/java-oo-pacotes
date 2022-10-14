package br.com.flaviocardoso.modelo;

public class Guardador {
	private Object[] referencias;
	private int posicaoLivre;
	
	public Guardador() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Object ob1) {
		this.referencias[this.posicaoLivre] = ob1;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferncia(int ref) {
		return this.referencias[ref];
	}
	
	
}
