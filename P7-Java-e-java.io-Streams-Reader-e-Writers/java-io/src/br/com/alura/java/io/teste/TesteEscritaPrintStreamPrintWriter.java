package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		/*
		 * OutputStream fos = new FileOutputStream("lorem.txt"); Writer osw = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osw);
		 * bw.write("Ganhamo!!!");
		 * bw.close();
		 */
		
		/*
		 * FileWriter fw = new FileWriter("lorem.txt"); fw.write("Perdemo??");
		 * fw.write("\n"); fw.write(System.lineSeparator()); fw.write("Ganhamo!!!");
		 * fw.close();
		 */
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));
		//PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Ganhamooo!!!!");
		ps.println();
		ps.println("Recebaaaa");
				
		/*
		 * bw.write("Ganhamos??"); bw.newLine(); bw.newLine(); bw.write("Ganhamo!!!");
		 * bw.close();
		 */
		
	}

}
