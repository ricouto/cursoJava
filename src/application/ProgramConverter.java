package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais R$ %.2f", CurrencyConverter.converterMoney(priceDollar, quantityDollar));
		
		sc.close();

	}

}
