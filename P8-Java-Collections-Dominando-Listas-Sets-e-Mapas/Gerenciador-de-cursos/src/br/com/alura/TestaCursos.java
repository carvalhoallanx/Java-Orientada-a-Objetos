package br.com.alura;

import java.util.List;

public class TestaCursos {

	public static void main(String[] args) {
		
		Cursos Javapoo = new Cursos("Java POO", "Allan Carvalho");

		List<Aulas> aulas = Javapoo.getAulas();
		System.out.println(aulas);
		
		//aulas.add(new Aulas("Revisando as ArrayLists", 21));
		//System.out.println(Javapoo.getAulas());

		Javapoo.adiciona(new Aulas("Relacionamento de lista e objetos", 15));
		Javapoo.adiciona(new Aulas("Revisando as ArrayLists", 21));
		Javapoo.adiciona(new Aulas("Lista de objetos", 20));
		
		System.out.println(Javapoo.getAulas());
		
		//System.out.println(aulas == Javapoo.getAulas());
	}

}
