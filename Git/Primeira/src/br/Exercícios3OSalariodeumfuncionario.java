package br;

import java.util.Scanner;

public class Exerc�cios3OSalariodeumfuncionario {
	
		public static void main(String[] args) { 
			
		float aumento = 128/100; 
		float salario; 
		
		Scanner scanner; scanner = new Scanner(System.in);
		
		System.out.println("Digite aqui o seu Salario"); salario = scanner.nextFloat();
	
		System.out.println("Seu Novo salario � de:" + (salario*128/100));
	}
		
}
