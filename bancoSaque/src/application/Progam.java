package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.println("Enter account number");
		int number = sc.nextInt();
		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit y/n " );
		char response = sc.next().charAt(0);
		if ( response  == 'y') {
			System.out.println("Enter inicial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account (number, holder, initialDeposit);
		}
		else {
			account = new Account (number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawtValue = sc.nextDouble();
		account.withdraw(withdrawtValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
