package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double codPecaA, numPecaA, valorPecaA, codPecaB, numPecaB, valorPecaB;
		
		codPecaA = sc.nextInt();
		numPecaA = sc.nextInt();
		valorPecaA = sc.nextDouble();
		
		codPecaB = sc.nextInt();
		numPecaB = sc.nextInt();
		valorPecaB = sc.nextDouble();
		
		valorPecaA = (valorPecaA * numPecaA) + (valorPecaB * numPecaB);
		
		System.out.printf("A valor a pagar eh : %.2f", valorPecaA );
		
		sc.close();
	}

}

