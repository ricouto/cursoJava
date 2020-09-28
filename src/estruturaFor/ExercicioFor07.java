package estruturaFor;

import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double numMath = sc.nextInt();

		if (numMath <= 0)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (double i = 1; i <= numMath; i++) {
				System.out.printf("Linha : %.0f, Quadrado : %.0f, Cubo : %.0f%n",i,  Math.pow(i, 2), Math.pow(i, 3));
			}
		}
		sc.close();
	}
}
