public class Gerente extends Funcionario implements Autenticavel {
	private AutenticadorUtil util;


	public Gerente() {
		this.util = new AutenticadorUtil();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.util.autentica(senha);
		return autenticou;
	}

	
	public double getBonus() {
		return super.getSalario();
	}
}