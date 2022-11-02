
public class AutenticadorUtil {
	private int senha;
	
	public double getBonus() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
