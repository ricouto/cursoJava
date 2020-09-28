package estruturaFor;

import java.util.Scanner;

public class ExercicioFor05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numFator = 1, loop = sc.nextInt();

		if (loop < 0)
			System.out.println("Favor informar numero maior que zero (0)!");
		else if (loop == 0)
			System.out.println(numFator);
		else {
			for (int i = 1; i <= loop; i++) {
				numFator = numFator * (i);
			}
			System.out.println(numFator);
		}
		sc.close();
	}
}
