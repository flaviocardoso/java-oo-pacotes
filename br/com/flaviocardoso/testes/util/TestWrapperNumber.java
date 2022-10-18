package br.com.flaviocardoso.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperNumber {
	public static void main(String[] args) {
		// Number
		Integer intRef = Integer.valueOf(34); // autoboxing
		Number intNRef = Integer.valueOf(34); // autoboxing 
		int valorInteger = intRef.intValue(); // unboxing
		int valorNInteger = intNRef.intValue(); // unboxing
		
		Double doubleRef = Double.valueOf(5.7); // autoboxing
		Number doubleNRef = Double.valueOf(5.7); // autoboxing
		double valorDouble = doubleRef.doubleValue(); // unboxing
		double valorNDouble = doubleNRef.doubleValue(); // unboxing
		
		Float floatRef = Float.valueOf(5.6f); // autoboxing
		Number floatNRef = Float.valueOf(5.6f); // autoboxing
		float valorFloat = floatRef.floatValue(); // unboxing
		float valorNFloat = floatNRef.floatValue(); // unboxing
		
		Long longRef = Long.valueOf(3994L); // autoboxing
		Long longNRef = Long.valueOf(3994L); // autoboxing
		long valorLong = longRef.longValue(); // unboxing
		long valorNLong = longNRef.longValue(); // unboxing
		
//		Short shortRef = Short.valueOf(1);
//		Number shortNRef = Short.valueOf(0xBB);
//		long valorShort = shortRef.shortValue(); // unboxing
//		long valorNLong = shortNRef.shortValue(); // unboxing
		
		
		
		// Boolean 
		Boolean booleanREf = Boolean.TRUE;
		boolean valorBoolean = booleanREf.booleanValue();
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		
//		System.out.println(valor);
		
		// int[] numeros = {0, 1, 2, 3, 5, 6, 7};
		
		// Number -> Object
		// arraylist permite numeros repitidos
		List<Number> numeros = new ArrayList<Number>();
		numeros.add(valorInteger);
		numeros.add(valorNInteger);
		numeros.add(valorDouble);
		numeros.add(valorNDouble);
		numeros.add(valorFloat);
		numeros.add(valorNFloat);
		numeros.add(valorLong);
		numeros.add(valorNLong);
		
	}
}
