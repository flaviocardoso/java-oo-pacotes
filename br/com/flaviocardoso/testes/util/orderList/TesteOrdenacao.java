package br.com.flaviocardoso.testes.util.orderList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.flaviocardoso.banco.Cliente;
import br.com.flaviocardoso.banco.Conta;
import br.com.flaviocardoso.banco.ContaCorrente;
import br.com.flaviocardoso.banco.ContaPoupanca;
import br.com.flaviocardoso.banco.excecao.NaoPodeComValorNegativoException;

public class TesteOrdenacao {
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
			
			lista.sort(new Comparator<Conta>() { // classe anomina
				@Override
				public int compare(Conta c1, Conta c2) {
					return Integer.compare(c1.getNumero(), c2.getNumero());
				}
			});
			
			lista.sort((Conta c1, Conta c2) -> { // lambda
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				return nomeC1.compareTo(nomeC2);
			});
			
			// lambda sem chaves (O java já sabe que são contas)
			lista.sort((c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome()));
			
			lista.forEach((c) -> System.out.println(c)); // loop foreach lambda
			
			// Exemplo
			List<String> nomes = new ArrayList<String>();
			nomes.add("Super Mario");
			nomes.add("Yoshi");
			nomes.add("Donkey Kong");
			
			//Collections.sort(nomes, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
			nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
			
			nomes.forEach((n) -> System.out.println(n));
			
		} catch(NaoPodeComValorNegativoException e) {
			e.printStackTrace();
		}
	}
}
