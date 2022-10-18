package br.com.flaviocardoso.testes.util;

/**
 * Autoboxing / unboxing
 * @author flaviocardoso
 *
 */
public class Teste5 {
	public static void main(String[] args) {
		/**
		 * Incrementa um valor inteiro mesmo sendo uma referencia.
		 * Por debaixo dos panos é um autoboxing / unboxing na linha que incrementa a variáveil (ref++).
		 */
		Integer ref = Integer.valueOf("3");
		ref++;
		System.out.println(ref);
	}
}
