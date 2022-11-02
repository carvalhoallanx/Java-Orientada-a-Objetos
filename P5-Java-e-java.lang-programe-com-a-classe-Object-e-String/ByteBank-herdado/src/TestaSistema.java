
public class TestaSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador a = new Administrador();
		a.setSenha(33);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(a);
	}
}
