package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	// método para calcular o salário grosso menos a taxa.
	public double netSalary() {
		return grossSalary - tax;
	}
	// método para aumentar o salário recebendo ele mesmo mais a taxa.
	public void InscreaseSalary(double percentage) {
			grossSalary += grossSalary * percentage / 100.0;
	}
	// método to String para apresentar os dados na tela.
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
	
}
