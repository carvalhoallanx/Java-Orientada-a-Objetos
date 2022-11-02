
public class Administrador extends Funcionario implements Autenticavel{
	private AutenticadorUtil util;
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	public Administrador() {
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


}
