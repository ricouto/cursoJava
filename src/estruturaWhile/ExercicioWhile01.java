package estruturaWhile;
import java.util.Scanner;

public class ExercicioWhile01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha, senhaValida = 2002 ;
		
		senha = sc.nextInt();
		
		while (senha != senhaValida) {
			System.out.println("Senha invalida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
