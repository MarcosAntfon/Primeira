package br;

import java.util.Scanner;

	public class Exercícios2MediaEscolar {
		
	public static void main(String[] args) { 
		
		int valor1; 
		int valor2; 
		int valor3; 
		
		Scanner scanner; scanner = new Scanner(System.in); 
		
		System.out.println("Digite a Primeira Nota"); 
		valor1 = scanner.nextInt(); 
		
		System.out.println("Digite a Segunda Nota"); 
		valor2 = scanner.nextInt(); 
		
		System.out.println("Digite a Terceira Nota"); 
		valor3 = scanner.nextInt(); 
		
		float media1 = (valor1 + valor2 + valor3) / 3; 
	
		System.out.println("Sua media é:" + media1);
	}
}
