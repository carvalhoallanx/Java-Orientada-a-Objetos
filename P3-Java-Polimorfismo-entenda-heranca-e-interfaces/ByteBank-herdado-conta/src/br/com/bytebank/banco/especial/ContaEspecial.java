package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	public void deposita(double valor) {
		super.setSaldo(valor);
	}
}
