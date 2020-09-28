package estruturaFor;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numIn = 0, numOut = 0, loop = sc.nextInt();

		if (loop == 0)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (int i = 0; i < loop; i++) {
				int numRange = sc.nextInt();
				if (numRange >= 10 && numRange <= 20)
					numIn = numIn + 1;
				else
					numOut = numOut + 1;
			}
			System.out.println(numIn + " in");
			System.out.println(numOut + " out");
		}
		sc.close();
	}
}
