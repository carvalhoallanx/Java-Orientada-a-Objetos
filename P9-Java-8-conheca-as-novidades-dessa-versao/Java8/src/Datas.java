import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate Copa2022 = LocalDate.of(2022, 11, 25);
		
		int anos = Copa2022.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, Copa2022);
		System.out.println(periodo.getDays());
		
		LocalDate ProximasCopas = Copa2022.plusYears(4);
		System.out.println(ProximasCopas);
		
		DateTimeFormatter formatadordatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String ValorFormatado = ProximasCopas.format(formatadordatas);
		System.out.println(ValorFormatado);
		
		DateTimeFormatter formatadorhoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorhoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}
}
