package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TestaString {

	public static void main(String[] args) {
		
		String nome = "Alan";
		
		//mostra se o String esta vazio ou não
		String Vazio = " ";
		String outrovazio = Vazio.trim(); //tira espaços de uma String
		System.out.println(Vazio.isEmpty());
		System.out.println(outrovazio.isEmpty());
		
		//mostra o numero de caracteres
		//System.out.println(nome.length());
		
		//mostra caracter por caracter
		//for (int i = 0; i < nome.length(); i++) {
		//	System.out.println(nome.charAt(i));
		//}
		
		//mostra apenas as letras pequenas
		//String sub = nome.substring(1);
		//System.out.println(sub);
		
		//imprime a posição do caracter
		//int pos = nome.indexOf("an");
		//System.out.println(pos);
		
		//imprime o caracter encolhido
		//char c = nome.charAt(2);
		//System.out.println(c);
		
		//Imprime apenas um caracter
		//char c = 'A';
		//char d = 'a';
		
		//System.out.println(c);
		//System.out.println(d);
		
		//String outra = nome.replace("A","a");
		
		//String outra = nome.toLowerCase();
		//System.out.println(outra);
		
	}

}
