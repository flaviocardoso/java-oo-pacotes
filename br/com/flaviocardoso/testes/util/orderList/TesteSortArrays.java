package br.com.flaviocardoso.testes.util.orderList;

import java.util.Arrays;

public class TesteSortArrays {
	public static void main(String[] args) {
		int[] numeros = new int[] {43, 15, 64, 22, 89};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
	}
}
