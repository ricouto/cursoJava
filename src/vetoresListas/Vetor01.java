package vetoresListas;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int x = 0; x < n; x++) {
			vect[x] += sc.nextDouble();
		}
		
		
		double sum = 0.0;
		for(int x = 0; x < n; x++) {
			sum += vect[x];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average height: %.2f", avg);
		
		
		sc.close();

	}

}
