package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product () {
		
	}
	
	
	// construtor que executa no momento da instanciação do objeto.
	// recebendo os dados.
	public Product(String name, double price, int quantity) {

		// this para acessar os campos do objeto.

		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Product(String name, double price) {

		this.name = name;
		this.price = price;

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {

		// método adicionar produtos..

		this.quantity += quantity;
	}

	// método de remover produtos.

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

	}

	// método toString mostrar os dados em tela.
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
