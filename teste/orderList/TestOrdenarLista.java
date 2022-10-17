package br.com.flaviocardoso.testes.util.orderList;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.flaviocardoso.banco.Conta;
import br.com.flaviocardoso.banco.ContaCorrente;
import br.com.flaviocardoso.banco.ContaPoupanca;
import br.com.flaviocardoso.banco.excecao.NaoPodeComValorNegativoException;

public class TestOrdenarLista {
	public static void main(String[] args) {
		
		try {
			Conta cc1 = new ContaCorrente(13, 66);
			cc1.depositar(343.0);
			
			Conta cc2 = new ContaPoupanca(14, 28);
			cc2.depositar(545.0);
			
			Conta cc3 = new ContaCorrente(34, 65);
			cc3.depositar(453.0);
			
			Conta cc4 = new ContaPoupanca(36, 93);
			cc4.depositar(564.0);
			
			List<Conta> lista = new ArrayList<Conta>();
			lista.add(cc1);
			lista.add(cc2);
			lista.add(cc3);
			lista.add(cc4);
			
			System.out.println("----Organiza Conta por número----");
			
			NumeroContaCompardor comparadorNumero = new NumeroContaCompardor();
			
			lista.sort(comparadorNumero);
			
			loop(lista, "numero");
			
			System.out.println("----Organiza Conta por agencia----");
			
			AgenciaContaCompardor comparadorAgencia = new AgenciaContaCompardor();

			lista.sort(comparadorAgencia);
			loop(lista, "agencia");
			
			System.out.println("----Organiza Conta por saldo----");
			
			SaldoContaCompardor comparadorSaldo = new SaldoContaCompardor();

			lista.sort(comparadorSaldo);
			loop(lista, "saldo");
			
			
		} catch (NaoPodeComValorNegativoException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loop(List<Conta> lista, String attribute) 
			throws 
				NoSuchMethodException, 
				SecurityException, 
				IllegalAccessException, 
				IllegalArgumentException, 
				InvocationTargetException {
		String valor = "get" + attribute.substring(0,1).toUpperCase() + attribute.substring(1);
		
		for(Conta c : lista) {
			Class<? extends Conta> pegaClasse = c.getClass();
			Method method = pegaClasse.getMethod("get" + valor.substring(0,1).toUpperCase() + valor.substring(1), null);
			System.out.println(method.invoke(c, new Object[0]));
//			System.out.println(valor.substring(0,1).toUpperCase() + valor.substring(1));
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
