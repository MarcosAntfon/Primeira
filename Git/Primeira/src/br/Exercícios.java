package br;

import java.util.Scanner;

public class Exerc�cios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int valor4;
				
		System.out.println("digite o Primeiro N�mero");
		valor1 = scan.nextInt();
		
		System.out.println("digite o Segundo N�mero");
		valor2 = scan.nextInt();
		
		System.out.println("digite o Terceiro N�mero");
		valor3 = scan.nextInt();
		
		System.out.println("digite o Quarto N�mero");
		valor4 = scan.nextInt();
		
		System.out.println(valor1 + valor2 + valor3 + valor4);
	
	}

}
