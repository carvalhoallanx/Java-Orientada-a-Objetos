package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//Integer
		int valor = idadeRef.intValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); //Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		
		//String s = args[0];
		//Integer n = Integer.valueOf(s); //Parsing
		//System.out.println(n);
		
		//int n = Integer.parseInt(s);
		//System.out.println(n);
		
		System.out.println(valor);
		System.out.println(numeros.get(0));
	}

}
