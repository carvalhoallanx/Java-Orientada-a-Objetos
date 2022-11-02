package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(aula1);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraaula = aulas.get(0);
		System.out.println("Primeira aula e: "+primeiraaula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula :"+aulas.get(i));
		}
		
		aulas.forEach(aula -> {System.out.println("Percorendo : "+aula);});
		
		aulas.add("Aumentando Conhecimento");
		Collections.sort(aulas);
		System.out.println(aulas);
		
	}
}
