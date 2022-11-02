public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		conta.saca(20);
		System.out.println(conta.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(300, conta)) {
			System.out.println("Transferencia feita com sucesso!!");
		}
		
		
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		
		conta.titular = "Allan Carvalho";
		System.out.println(conta.titular);
	}
}