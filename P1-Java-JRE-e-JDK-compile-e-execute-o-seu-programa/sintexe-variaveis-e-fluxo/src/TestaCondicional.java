public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando");
		int idade = 17;
		int quantidadedepessoas = 3;
		if (idade >= 18) {
			System.out.println("Maior de idade");
			System.out.println("Bem-Vindo!");
		}else {
			if (quantidadedepessoas >= 2) {
				System.out.println("Voce esta acompanhado pode entrar!");
			}else {
			System.out.println("Infelizmente voce nao pode entrar!");
			}
		}
	}
}