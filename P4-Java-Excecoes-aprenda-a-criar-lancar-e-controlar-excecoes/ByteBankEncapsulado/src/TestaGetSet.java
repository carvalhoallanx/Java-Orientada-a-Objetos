
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,224);
		conta.setNumero(123);
		
		Cliente alan = new Cliente();
		alan.setNome("Allan Carvalho");
		conta.setTitular(alan);
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getNome());
	}

}
