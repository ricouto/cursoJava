package estruturaFor;

import java.util.Scanner;

public class ExercicioFor06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int restoDivisao = 0, numDividir = sc.nextInt();

		if (numDividir < 0)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (int i = 1; i <= numDividir; i++) {
				restoDivisao = numDividir % i;
				if (restoDivisao == 0)
					System.out.println(i);
			}
		}
		sc.close();
	}
}
