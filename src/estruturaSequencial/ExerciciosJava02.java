package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double pi, raio, area;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * (Math.pow(raio, 2));
		
		//System.out.print("A area do circulo %.2f * %.5f ^2 eh : %.4f", raio, pi, area );
		
		sc.close();
	}

}
