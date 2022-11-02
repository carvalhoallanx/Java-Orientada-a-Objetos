public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando");
		
		int idade = 18;
		int quantidadepessoas = 3;
		
		//boolean acompanhado;
		
		boolean acompanhado;
		
		if (quantidadepessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Seja Bem-Vindo!");
		}else {
			System.out.println("Infelizmente voce nao pode entrar!");
		}
	}
}