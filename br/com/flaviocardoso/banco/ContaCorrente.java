package br.com.flaviocardoso.banco;

import br.com.flaviocardoso.banco.excecao.*;

public class ContaCorrente extends Conta implements Tributavel {
	
	private double taxa = 0.01;
	
	public ContaCorrente(int agencia, int numero) throws NaoPodeComValorNegativoException {
		super(agencia, numero);
	}
	
	@Override
	public void sacar(double valor) {
		double valorASacar = valor - this.taxa;
		super.sacar(valorASacar);
	}

	// usado como exemplo
	@Override
	public void depositar(double valor) {
		super.saldo += valor - ( this.taxa * valor );  
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * taxa;
	}
}
