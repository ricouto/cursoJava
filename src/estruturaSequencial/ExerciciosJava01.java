package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		System.out.println("A soma dos numeros " + x + " e " + y + " eh : " + soma);
		
		sc.close();
	}

}
