package vetoresListas;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor;

public class Vetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetor[] vect = new ProductVetor[n];
		
		for(int x = 0; x < vect.length; x++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[x] = new ProductVetor(name, price);
		}
		
		double sum = 0.0;
		for(int x = 0; x < vect.length; x++) {
			sum += vect[x].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average height: %.2f", avg);
		
		sc.close();
	}
}
