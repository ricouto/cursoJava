package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf02 {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero:");
		numero = sc.nextInt();
		
		numero = numero % 2;
		
		if(numero == 0) {
			System.out.println("Numero informado eh par");
		}
		else {
		System.out.println("Numero informado eh impar");
		}
		
		sc.close();
	}

}
