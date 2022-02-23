package entities;

public class Rectangle {
	
	public  double widht;
	public  double height;
	// calcula a área que e largura * largura.
	public double area() {
		return widht * height ;
		
	}
	// calcula o perímetro que e altura * altura.
	public double perimeter() {
		return 2 * (widht + height);
		
	}
		// retorna o valor da diagonal que e largura * largura + altura * altura .
	public double diagonal() {
		return Math.sqrt(widht * widht + height * height);
	}
	
}
