package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf06 {

	public static void main(String[] args) {

		double valorRandom;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe um numero dentro do intervalo [0 - 100] - -");
		valorRandom = sc.nextDouble();
		
		if(valorRandom < 0 || valorRandom > 100) 
			System.out.println("Valor fora do intervalo!");
		
		else if(valorRandom <= 25) {
			System.out.printf("Numero dentro do intervalo [0 - 25]");
		}
		else if(valorRandom <= 50) {
			System.out.printf("Numero dentro do intervalo (25 - 50]");
		}
		else if(valorRandom <= 75){
			System.out.printf("Numero dentro do intervalo (50 - 75]");
		}
		else{
			System.out.printf("Numero dentro do intervalo (75 - 100]");
		}
		sc.close();
	}
}
