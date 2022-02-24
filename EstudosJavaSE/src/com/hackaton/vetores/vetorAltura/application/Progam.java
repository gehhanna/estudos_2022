/* Programa para informar o tamanho do vetor inicialmente e guardar informa��es
dentro do mesmo ate o numero de repeti��es for igual do  valor digitado inicialmente.
*/

package com.hackaton.vetores.vetorAltura.application;
import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		// Locale para mudar a região para ponto no teclado.
		Locale.setDefault(Locale.US);
		// entrada de dados do teclado.
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		// enquanto o valor de i que e o tamanho do vetor for menor que o valor digitado 
		//  repita a ação e guarde as informações no vetor.
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		// soma recebendo valor zero inicial
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		// media vai ser soma dividido por n que e o numero de valores armazenados.
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGTH: %.2f%n" , avg);
		
		sc.close();
		
	}

}
