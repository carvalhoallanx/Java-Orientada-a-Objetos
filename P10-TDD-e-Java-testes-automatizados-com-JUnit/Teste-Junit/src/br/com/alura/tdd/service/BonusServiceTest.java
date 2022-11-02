package br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroSalarioAcimaDeMil() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Allan", LocalDate.now(), new BigDecimal("25000"))));
	}
	
	@Test
	void bonusDeveriaSer10PorCentodoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Allan", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"),bonus);
	}
	
	@Test
	void bonusDeveriaSerDexPorCentoSalarioAcimaDeDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Allan", LocalDate.now(), new BigDecimal("1000")));
		
		assertEquals(new BigDecimal("100.00"),bonus);
	}

}
