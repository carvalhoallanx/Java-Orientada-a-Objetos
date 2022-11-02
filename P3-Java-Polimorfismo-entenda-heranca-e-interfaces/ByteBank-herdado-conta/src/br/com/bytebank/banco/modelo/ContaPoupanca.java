package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void depositar(double valor) {
		super.setSaldo(valor);

	}
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
}