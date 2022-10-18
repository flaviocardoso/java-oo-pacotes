package br.com.flaviocardoso.testes.util.orderList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.flaviocardoso.banco.Cliente;
import br.com.flaviocardoso.banco.Conta;
import br.com.flaviocardoso.banco.ContaCorrente;
import br.com.flaviocardoso.banco.ContaPoupanca;
import br.com.flaviocardoso.banco.excecao.NaoPodeComValorNegativoException;

public class TestOrdenarLista {
	public static void main(String[] args) {
		
		try {
			
			Conta cc1 = new ContaCorrente(13, 66);
			Cliente cl1 = new Cliente();
			cl1.setNome("Flavio");
			cc1.setTitular(cl1);
			cc1.depositar(343.0);
			
			Conta cc2 = new ContaPoupanca(14, 28);
			Cliente cl2 = new Cliente();
			cl2.setNome("Cardoso");
			cc2.setTitular(cl2);
			cc2.depositar(545.0);
//			
			Conta cc3 = new ContaCorrente(34, 65);
			Cliente cl3 = new Cliente();
			cl3.setNome("Tiago");
			cc3.setTitular(cl3);
			cc3.depositar(453.0);
			
			Conta cc4 = new ContaPoupanca(36, 93);
			Cliente cl4 = new Cliente();
			cl4.setNome("Wagner");
			cc4.setTitular(cl4);
			cc4.depositar(564.0);
			
			List<Conta> lista = new ArrayList<Conta>();
			lista.add(cc1);
			lista.add(cc2);
			lista.add(cc3);
			lista.add(cc4);
			
			System.out.println("----Organiza Conta por número----");
			
			NumeroContaCompardor comparadorNumero = new NumeroContaCompardor();
			
			lista.sort(comparadorNumero);
			
			for (Conta c : lista) {
				System.out.println(c.getNumero());
			}
			
			System.out.println("----Organiza Conta por agencia----");
			
			AgenciaContaCompardor comparadorAgencia = new AgenciaContaCompardor();

			lista.sort(comparadorAgencia);
			
			for (Conta c : lista) {
				System.out.println(c.getAgencia());
			}
			
			System.out.println("----Organiza Conta por saldo----");
			
			SaldoContaCompardor comparadorSaldo = new SaldoContaCompardor();

			lista.sort(comparadorSaldo);
			
			for (Conta c: lista) {
				System.out.println(c.getSaldo());
			}
			
			System.out.println("---Organiza Conta por titular nome----");
			
			TitularContaComparator comparadorTitularNome = new TitularContaComparator();
			
			lista.sort(comparadorTitularNome);
			
			for (Conta c: lista) {
				System.out.println(c.getTitular().getNome());
			}
			
			
		} catch (NaoPodeComValorNegativoException e) {
			e.printStackTrace();
		}
	}
	
	
	
}

class NumeroContaCompardor implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNumero() - c2.getNumero() ;
	}
	
}

class AgenciaContaCompardor implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getAgencia() - c2.getAgencia() ;
	}
	
}

class SaldoContaCompardor implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.valueOf((int) (c1.getSaldo() - c2.getSaldo())) ;
	}
	
}

class TitularContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2);
	}
	
}
