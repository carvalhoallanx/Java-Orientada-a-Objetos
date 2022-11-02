package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Cursos {
	private String nome;
	private String instrutor;
	private List<Aulas> aulas = new ArrayList<Aulas>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Cursos(String nome, String instrutor) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.setNome(nome);
		this.setInstrutor(instrutor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aulas> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aulas aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aulas::getTempo).sum();		
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + "," + " aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean VerificaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}
