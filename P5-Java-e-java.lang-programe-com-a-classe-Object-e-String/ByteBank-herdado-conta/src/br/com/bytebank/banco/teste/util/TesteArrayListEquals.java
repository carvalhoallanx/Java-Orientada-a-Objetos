package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11); 
//		Conta cc2 = new ContaCorrente(22, 11); 
//		
//		boolean check = cc1.CheckConta(cc2);
//		System.out.println(check);
		
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11); 
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 12); 
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 12);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Ja existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
