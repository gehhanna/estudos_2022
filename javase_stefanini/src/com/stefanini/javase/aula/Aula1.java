package com.stefanini.javase.aula;


import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		
		// Scanner para entrada de dados no teclado.
		Scanner sc = new Scanner(System.in);

		// novo vetor com o tamanho.
		String[] carros = new String[1];

		// para i = recebendo valor 0 inicial, e enquanto i< que o tamanho do vetor
		// carros.lenght;, ele recebe o valor i++.
		for (int i = 0; i < carros.length; i++) {

			System.out.println("Digite o nome do carro: ");
			// recebe a entrada dos dados e armazena no vetor.
			carros[i] = sc.nextLine();
			
		}
		// aqui crio uma variável nome recebendo os carros e depois a impressão dela.
		for (String nome : carros) {
			System.out.println(nome);
			
		}
		sc.close();
	}
}
