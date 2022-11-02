package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Pedro");
		alunos.add("Nico");
		alunos.add("Celso");
		alunos.add("Maria");
		
		boolean CelsoEstaMatriculado = alunos.contains("Celso");
		System.out.println(CelsoEstaMatriculado);
		
		alunos.remove("Maria");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> { System.out.println(aluno); });
		System.out.println(alunos);
		
		List<String> alunosEmlista = new ArrayList<>(alunos);
		Collections.sort(alunosEmlista);
		System.out.println(alunosEmlista);

	}
}
