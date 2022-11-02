public class TesteIR {
	public static void main(String[] args) {
		double salario = 4300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Seu IR e de 7.5%");
			System.out.println("Voce pode deduzir na declaracao R$142");
			
		}if(salario >= 2800.1 && salario <= 3751.8 ){
			System.out.println("Seu IR e de 15%");
			System.out.println("Voce pode deduzir na declaracao R$350");
			
		}if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Seu IR e de 22.5%");
			System.out.println("Vode pode deduzir na declaracao R$636");
		}
		
	}
}