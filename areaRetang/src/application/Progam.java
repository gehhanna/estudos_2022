package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// locale para seta como ponto as vírgulas.
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		// criação do novo retângulo 
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter Rectangle widht and height: ");
		// entrada de dados recebe os valores de altura e largura.
		rect.widht = sc.nextDouble();
		rect.height = sc.nextDouble();
		//  o print f que vem de format como e usado ali uma formatação.
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
		
	}

}
