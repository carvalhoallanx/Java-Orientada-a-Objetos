import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso{
	private String nome;
	private int aluno;
	
	public Curso(String nome, int aluno) {
		this.nome = nome;
		this.aluno = aluno;
	}

	public String getNome() {
		return nome;
	}

	public int getAluno() {
		return aluno;
	}

}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAluno));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//int sum = cursos.stream().filter(c -> c.getAluno() >= 100).mapToInt(Curso::getAluno).sum();
		//System.out.println(sum);
		
		OptionalDouble media = cursos.stream().filter(c -> c.getAluno() >= 100).mapToInt(Curso::getAluno).average();
		System.out.println(media);
		
		//cursos.stream().filter(c -> c.getAluno() >= 100).map(c -> c.getAluno()).forEach(total -> System.out.println(total));
		cursos.stream().filter(c -> c.getAluno() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream().filter(c -> c.getAluno() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAluno())).forEach((nome, alunos)
				-> System.out.println(nome + " tem " + alunos + " alunos"));
		
		//System.out.println(OptionalCurso.orElse(null).getNome());
		//OptionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
	}
}
