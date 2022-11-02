public class TesteRefecencias {
	public static void main(String[] args) {
		Conta PrimeiraConta = new Conta();
		PrimeiraConta.saldo = 300;
		System.out.println("Saldo primeira conta: " + PrimeiraConta.saldo);
		
		Conta SegundaConta = PrimeiraConta;
		System.out.println("Saldo da segunda conta: " + SegundaConta.saldo);
		
		SegundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + SegundaConta.saldo);
		System.out.println("Saldo primeira conta: " + PrimeiraConta.saldo);
		
		System.out.println(PrimeiraConta);
		System.out.println(SegundaConta);
	}
}