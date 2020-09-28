package estruturaFor;

import java.util.Scanner;

public class ExercicioFor04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		if (loop <= 0 || loop > 3)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (int i = 1; i <= loop; i++) {
				double num1 = sc.nextInt();
				double num2 = sc.nextInt();
				
				if (num2 == 0)
					System.out.println("Divisao Impossivel!");
				else {
					num1 = num1 / num2;
					System.out.printf("Resultado da divisao e : %.1f%n", num1);
				}
			}
		}
		sc.close();
	}
}
