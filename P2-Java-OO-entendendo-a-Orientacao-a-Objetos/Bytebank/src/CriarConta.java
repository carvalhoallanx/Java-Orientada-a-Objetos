public class CriarConta {
	public static void main(String[] args) {
		Conta PrimeiraConta = new Conta();
		PrimeiraConta.saldo = 200;
		
		PrimeiraConta.agencia = 146;
		System.out.println("A agencia da Primeira conta e: " + PrimeiraConta.agencia);
		
		PrimeiraConta.saldo += 100;
		System.out.println("Primeira conta tem: " + PrimeiraConta.saldo);
		
		
		
		Conta SegundaConta = new Conta();
		SegundaConta.saldo = 300;
		System.out.println("Segunda conta tem " + SegundaConta.saldo);
		
		SegundaConta.agencia = 146;
		System.out.println("A agencia da Segunda conta e: " + SegundaConta.agencia);
		
		System.out.println(PrimeiraConta);
		System.out.println(SegundaConta);
	}
}