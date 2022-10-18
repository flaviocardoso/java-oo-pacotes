package br.com.flaviocardoso.banco;

import br.com.flaviocardoso.banco.excecao.*;

public abstract class Conta extends Object implements Comparable<Conta> {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // atributo compartilhado da classe
	
	public Conta() {
		Conta.total++;
	}
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * Essa classe é abstrata deve ser usado nas classes filhas e não deve ser instânciada.
	 * 
	 * @param agencia
	 * @param numero
	 * @throws NaoPodeComValorNegativoException
	 */
	public Conta(int agencia, int numero) throws NaoPodeComValorNegativoException {
		if (agencia <= 0 || numero <= 0) {
			throw new NaoPodeComValorNegativoException("As entradas não podem ser negativas");
		}
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser negativa");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) throws NaoPodeComValorNegativoException {
		if (numero <= 0) {
			throw new NaoPodeComValorNegativoException("Numero não pode ser negativo");
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public abstract void depositar(double valor);
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente: salado - " + this.saldo + ", valor passado - " + valor);
		}
		this.saldo -= valor;
	}
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	// atributos de instancia não podem ser acessados por métodos estáticos.
	public static int getTotal() { // metodo compartilhado da classe
		// this.saldo e saldo // dentro de um contexto estático não de pode usar variáveis de instância.
		return Conta.total;
	}
	
	// ordem natural
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo + ", Nome: " + this.titular.getNome();
	}
}
