package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf01 {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero:");
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("Numero informado eh positivo : " + numero);
		}
		else {
		System.out.println("Numero informado eh negativo : " + numero);
		}
		
		sc.close();
	}

}
