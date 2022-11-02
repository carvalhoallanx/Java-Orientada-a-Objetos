package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * @author AlanCarvalho
 * @version 0.1
 * 
 */

public abstract class Conta implements Comparable<Conta>, Serializable{
	private double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total = 0;
	
	
	/**
	 * Construtor da classe conta, com agencia e numero da conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.setTotal(Conta.getTotal() + 1);
		//System.out.println("O total de contas e "+total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Conta criada agencia e :"+this.agencia);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+this.saldo +", Valor: "+ valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	} 
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
		}
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public static int getTotal() {
		return Conta.total;
	}


	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero da Conta : " + this.numero + ", Agencia: "+ this.agencia + ", Saldo: "+ this.saldo;
	}
	
}