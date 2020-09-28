package estudoInicial;

import java.util.Scanner;

public class ExercicioForProfessor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

			for (int i = 1; i<=loop; i++) {
				if (i % 2 != 0)
					System.out.println(i);
			}	
		sc.close();
	}
}
