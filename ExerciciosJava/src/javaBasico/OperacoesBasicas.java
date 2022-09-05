package javaBasico;

import java.util.Scanner;

public class OperacoesBasicas {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o primeiro numero:");
		
		double primeiroNumero = in.nextDouble();
		
		System.out.println("Insira o segundo numero:");
		
		double segundoNumero = in.nextDouble();
		
		in.close();
				
		System.out.println("A soma dos dois números é " + (primeiroNumero + segundoNumero));		
		System.out.println("A substração dos dois números é " + (primeiroNumero - segundoNumero));		
		System.out.println("A multiplicação dos dois números é " + (primeiroNumero * segundoNumero));		
		System.out.println("A divisão dos dois números é " + (primeiroNumero / segundoNumero));		
		
	}
}
