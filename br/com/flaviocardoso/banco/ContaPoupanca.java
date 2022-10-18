package br.com.flaviocardoso.banco;
import br.com.flaviocardoso.banco.excecao.*;

public class ContaPoupanca extends Conta {
	
	private double taxa = 0.002;
	
	public ContaPoupanca(int agencia, int numero) throws NaoPodeComValorNegativoException {
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
}
