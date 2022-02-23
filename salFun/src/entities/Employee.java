package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	// m�todo para calcular o sal�rio grosso menos a taxa.
	public double netSalary() {
		return grossSalary - tax;
	}
	// m�todo para aumentar o sal�rio recebendo ele mesmo mais a taxa.
	public void InscreaseSalary(double percentage) {
			grossSalary += grossSalary * percentage / 100.0;
	}
	// m�todo to String para apresentar os dados na tela.
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
	
}
