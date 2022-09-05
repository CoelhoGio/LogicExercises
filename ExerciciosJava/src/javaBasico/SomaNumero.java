package javaBasico;

import java.util.Scanner;

public class SomaNumero {

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Insira o primeiro numero:");
		
		int primeiroNumero = in.nextInt();
		
		System.out.println("Insira o segundo numero:");
		
		int segundoNumero = in.nextInt();
		
		in.close();
				
		System.out.println("A soma dos dois números é " + (primeiroNumero + segundoNumero));		
		
	}
}

