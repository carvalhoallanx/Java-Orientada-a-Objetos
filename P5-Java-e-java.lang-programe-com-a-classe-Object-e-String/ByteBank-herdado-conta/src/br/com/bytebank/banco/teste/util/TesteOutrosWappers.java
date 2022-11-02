package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());//unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());//unboxing
		
		Number refNumero = Integer.valueOf(29);


		List<Number> lista = new ArrayList<>();
		lista.add(10);
	}

}
