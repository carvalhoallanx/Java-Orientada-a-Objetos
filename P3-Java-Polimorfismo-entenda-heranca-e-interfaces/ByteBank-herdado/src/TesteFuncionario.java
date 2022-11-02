public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente funcionario = new Gerente();
		funcionario.setNome("Allan Carvalho");
		funcionario.setCpf("222.55.22");
		funcionario.setSalario(5000.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonus());
	}
}