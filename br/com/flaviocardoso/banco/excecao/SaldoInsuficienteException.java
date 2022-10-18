package br.com.flaviocardoso.banco.excecao;

/**
 * Classe representa uma execeção de saldo insuficiente
 * 
 * @author flaviocardoso
 *
 */

public class SaldoInsuficienteException extends RuntimeException {
	private static final long serialVersionUID = 4295967229570040313L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
