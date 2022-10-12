package br.com.flaviocardoso.escola.modelo;

import br.com.flaviocardoso.escola.excecao.StringComprimentoException;

import br.com.flaviocardoso.escola.excecao.NotaException;

public class Aluno {
	private String nomeAluno;
	private double nota1, nota2;
	
	/**
	 * Atribui um valor do nome diretp pelo construtor
	 * @param nome
	 */
	public Aluno(String nome) {
		if (nome.length() < 4) {
			throw new StringComprimentoException("Precisa que superior a quatro caracteres.");
		}
		this.nomeAluno = nome;
	}
	
	/**
	 * Pega o valor do nome do aluno
	 * @return int - retorna o nome
	 */
	public String getNomeAluno() {
		return this.nomeAluno;
	}
	
	/**
	 * Atribui um valor a nota 1
	 * @param nota
	 */
	public void setNota1(double nota) {
		this.verificacaoNota(nota);
		this.nota1 = nota;
	}
	
	/**
	 * Pega o valor da nota 1
	 * @return double - retorna o valor da nota 1
	 */
	public double getNota1() {
		return this.nota1;
	}
	
	/**
	 * Atribui um valor a nota 2
	 * @param nota
	 */
	public void setNota2(double nota) {
		this.verificacaoNota(nota);
		this.nota2 = nota;
	}
	
	/**
	 * Pega o valor da nota 2
	 * @return double - retorna o valor da nota 2
	 */
	public double getNota2() {
		return this.nota2;
	}
	
	/**
	 * Pega a média do aluno
	 * @return double - retorna a média
	 */
	public double getMediaAluno() {
		return (this.nota1 + this.nota2) / 2;
	}
	
	public boolean aprovado() {
		this.verificacaoNota(this.nota1);
		this.verificacaoNota(this.nota2);
		return this.getMediaAluno() >= 7;
	}
	
	/**
	 * Verifica notas menores de zero ou dez, e joga erro caso seja confirmado.
	 * @param nota
	 */
	private void verificacaoNota(double nota) {
		if (nota < 0) {
			throw new NotaException("Nota não pode ser menor que 0 (zero).");
		}
		if (nota > 10) {
			throw new NotaException("Nota não pode ser maior que 10 (dez).");
		}
	}
}
