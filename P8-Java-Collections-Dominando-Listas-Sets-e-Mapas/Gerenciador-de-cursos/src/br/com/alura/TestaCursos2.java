package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursos2 {

	public static void main(String[] args) {
		
		Cursos Javapoo = new Cursos("Java POO", "Allan Carvalho");
		Javapoo.adiciona(new Aulas("Relacionamento de lista e objetos", 15));
		Javapoo.adiciona(new Aulas("Revisando as ArrayLists", 21));
		Javapoo.adiciona(new Aulas("Lista de objetos", 20));
		
		List<Aulas> aulasImutaveis = Javapoo.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aulas> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println(Javapoo.getTempoTotal());
		
		System.out.println(Javapoo);
	}

}
