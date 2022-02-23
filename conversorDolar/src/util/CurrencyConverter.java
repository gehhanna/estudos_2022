package util;

public class CurrencyConverter {
	
	public double dolarPrice;
	public double dolarQtd;
	public double taxa ;
	
	
	// realTotal retorna o preço do dólar * a quantidade * a taxa. o 1+ serve pra retornar
	// o valor total mais a taxa.
	
	public double realTotal () {
		return (dolarPrice * dolarQtd * (1+taxa/100));
	}
	
}
