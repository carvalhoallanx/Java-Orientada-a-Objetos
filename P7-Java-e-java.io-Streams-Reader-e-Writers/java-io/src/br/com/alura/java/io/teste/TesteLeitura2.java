package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			//String[] valores = linha.split(",");
			//System.out.println(valores[3]);
			
			
			Scanner linhascanner = new Scanner(linha);
			linhascanner.useLocale(Locale.US);
			linhascanner.useDelimiter(",");
			
			String tconta = linhascanner.next();
			int agencia = linhascanner.nextInt();
			int numero = linhascanner.nextInt();
			String titular = linhascanner.next();
			double saldo = linhascanner.nextDouble();
			
			System.out.format("%s, %d, %d, %s, %f %n", tconta,agencia,numero,titular,saldo);
			
			linhascanner.close();
		}
		
		scanner.close();
	}
	
}
