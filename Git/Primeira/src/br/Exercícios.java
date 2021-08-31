package br;

import java.util.Scanner;

public class Exercícios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int valor4;
				
		System.out.println("digite o Primeiro Número");
		valor1 = scan.nextInt();
		
		System.out.println("digite o Segundo Número");
		valor2 = scan.nextInt();
		
		System.out.println("digite o Terceiro Número");
		valor3 = scan.nextInt();
		
		System.out.println("digite o Quarto Número");
		valor4 = scan.nextInt();
		
		System.out.println(valor1 + valor2 + valor3 + valor4);
	
	}

}
