package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Cursos JavaColecoes = new Cursos("Java POO", "Allan Carvalho");
		JavaColecoes.adiciona(new Aulas("Relacionamento de lista e objetos", 15));
		JavaColecoes.adiciona(new Aulas("Revisando as ArrayLists", 21));
		JavaColecoes.adiciona(new Aulas("Lista de objetos", 20));
		
		Aluno a1 = new Aluno("Alan Carvalho", 3345);
		Aluno a2 = new Aluno("Maria Geisiane",3346);
		Aluno a3 = new Aluno("Maria Jose", 3347);

		JavaColecoes.matricula(a1);
		JavaColecoes.matricula(a2);
		JavaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculador: ");
		
		Set<Aluno> alunos = JavaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}		
		
		//JavaColecoes.getAlunos().forEach(a -> {
		//	System.out.println(a);
		//});
		
		System.out.println(JavaColecoes.VerificaMatriculado(a1));
		
		Aluno Maria = new Aluno("Maria Jose",3347);
		System.out.println(a3.equals(Maria));
		//obrigatoriamente o seguinte é true
		
		System.out.println(a1.hashCode() == Maria.hashCode());
	}

}
