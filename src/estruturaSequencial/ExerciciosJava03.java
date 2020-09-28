package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a, b, c, d, diff;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diff = (a * b - c * d);
		
		System.out.printf("A diferenca entre os numeros eh : " + diff);
		
		sc.close();
	}

}
