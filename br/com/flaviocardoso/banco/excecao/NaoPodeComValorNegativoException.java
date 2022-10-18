package br.com.flaviocardoso.banco.excecao;

/**
 * Classe representa uma exceção com número negativo
 * 
 * @author flaviocardoso
 *
 */

public class NaoPodeComValorNegativoException extends Exception{
	private static final long serialVersionUID = -612124947496981196L;

	public NaoPodeComValorNegativoException(String msg) {
		super(msg);
	}
}
