public class TesteReferencias {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Allan");
		g1.setSalario(5000);
		
		EditordeVideo ev1 = new EditordeVideo();
		ev1.setSalario(2500);
		
		Designer d1 = new Designer();
		ev1.setSalario(2500);
		
		ControleBonus controle = new ControleBonus();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getTotal());
		System.out.println();
	}
}