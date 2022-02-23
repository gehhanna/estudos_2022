/*
 Programa recebe o valor do dólar a quantidade e calcula em cima do imposto digitado
 a quantidade total que ficara em reais.
*/
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Progam {

	public static void main (String[] args) {
		// seta a localidade.
		Locale.setDefault(Locale.US);
		// entrada de dados no teclado.
		Scanner sc = new Scanner (System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		// qual o valor do dólar.
		System.out.println("What is the dollar price? ");
		cc.dolarPrice = sc.nextDouble();
		// quantos dólares vai comprar.
		System.out.println("How many dollars will be bought? ");
		cc.dolarQtd = sc.nextDouble ();
		// e a taxa da cotação em cima do valor total.
		System.out.println("Tax: ");
		cc.taxa = sc.nextDouble();
		System.out.printf("Amount to be paid : %.2f%n" , cc.realTotal());
		
		sc.close();
		
	}
	
}
