package javaBasico;

import java.util.Scanner;

public class MediaCombustivel {


	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("Insira combustivel gasto em numero apenas:");
		
		Double combustivel = in.nextDouble();
		
		System.out.println("Insira distancia percorrida em numero apenas:");
		
		Double distancia = in.nextDouble();
		
		in.close();
		
		System.out.println("O consumo médio por distancia percorrida é: " + (distancia / combustivel) + "km/l");
		
	}

}
