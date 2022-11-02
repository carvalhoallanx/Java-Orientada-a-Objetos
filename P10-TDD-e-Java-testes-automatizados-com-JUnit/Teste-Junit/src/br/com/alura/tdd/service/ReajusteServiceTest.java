package br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		System.out.println("Inicializa");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@AfterEach
	public void finalizar(){
		System.out.println("Fim");
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de Todos");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de Todos");
	}
	

	@Test
	public void reajusteADesejarTresPorcento(){	
		service.reajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteBomQuinzePorcento(){
		service.reajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteOtimoVintePorcento(){
		service.reajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
