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
				
		System.out.println("A soma dos dois n�meros � " + (primeiroNumero + segundoNumero));		
		System.out.println("A substra��o dos dois n�meros � " + (primeiroNumero - segundoNumero));		
		System.out.println("A multiplica��o dos dois n�meros � " + (primeiroNumero * segundoNumero));		
		System.out.println("A divis�o dos dois n�meros � " + (primeiroNumero / segundoNumero));		
		
	}
}
