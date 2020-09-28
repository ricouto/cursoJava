package estruturaFor;
import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double mPondera = 0.0;
		int loop = sc.nextInt();

		if (loop <= 0 || loop > 3)
			System.out.println("Favor informar numero maior que zero (0)!");
		else {
			for (int i = 0; i < loop; i++) {
				double numRange1 = sc.nextDouble();
				double numRange2 = sc.nextDouble();
				double numRange3 = sc.nextDouble();
				
				mPondera = ((numRange1 * 2) + (numRange2 * 3) + (numRange3 * 5))/10;
				
				System.out.printf("A media ponderada e : %.1f", mPondera);
			}
		}
		sc.close();
	}
}

/*
 if (peso != 3)
					peso = peso + 1;
				else
					peso = peso + 2;
				
				double numRange = sc.nextDouble();
				
				mPondera = mPondera + (numRange * peso);
				somaPeso = somaPeso + peso;
			}
			//mPondera = mPondera / somaPeso;
			System.out.printf("A media ponderada e : %.1f", (mPondera / somaPeso)); 
*/
