package estruturaFor;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		if (loop == 0)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (int i = 1; i <= loop; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}
