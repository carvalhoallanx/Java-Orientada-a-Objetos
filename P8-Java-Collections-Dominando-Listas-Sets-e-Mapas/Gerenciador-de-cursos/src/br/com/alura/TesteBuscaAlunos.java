package br.com.alura;

public class TesteBuscaAlunos {

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
		
		System.out.println("Qual o aluno com matricula 3345?");
		Aluno aluno = JavaColecoes.buscaMatriculado(3345);
		System.out.println("Aluno: "+ aluno);
	}

}
