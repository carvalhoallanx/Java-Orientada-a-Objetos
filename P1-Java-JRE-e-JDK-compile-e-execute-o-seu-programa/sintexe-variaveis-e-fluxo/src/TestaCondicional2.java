public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando");
		int idade = 18;
		int quantidadepessoas = 3;
		boolean acompanhado = quantidadepessoas >=2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado){
			System.out.println("Seja Bem-Vindo!");
		}else {
			System.out.println("Infelizmente voce nao pode entrar!");
		}
	}
}