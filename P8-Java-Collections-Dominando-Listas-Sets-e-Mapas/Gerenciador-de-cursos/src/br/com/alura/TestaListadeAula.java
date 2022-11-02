package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListadeAula {

	public static void main(String[] args) {
		
		Aulas a1 = new Aulas("Revisando as ArrayLists", 21);
		Aulas a2 = new Aulas("Lista de objetos", 20);
		Aulas a3 = new Aulas("Relacionamento de lista e objetos", 15);
		
		ArrayList<Aulas> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aulas::getTempo));
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aulas::getTempo));
	}

}
