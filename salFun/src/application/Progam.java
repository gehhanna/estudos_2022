// Programa criado para receber o nome do funcionário seu salário grosso e tirar uma taxa sobre ele, e depois aumentar um valor no bruto.
// gehhanna

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// empregado novo empregado.	
		Employee emp = new Employee();
		// nome do funcionário 
		System.out.println("Name: ");
		// Salário grosso.
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		// Taxa de aumento do salário
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		// Qual porcentagem para aumentar no salário.
		System.out.println("Wich percentage to inscrease salary? ");
		double percentage = sc.nextDouble();
		emp.InscreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update Data: " + emp);
		sc.close();
		
	}

}
