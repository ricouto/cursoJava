package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double converterMoney(double priceDollar, double quantityDollar) {
		
		return (priceDollar * quantityDollar) * IOF; 
		
	}

}
