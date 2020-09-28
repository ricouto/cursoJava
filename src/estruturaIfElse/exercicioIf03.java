package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf03 {

	public static void main(String[] args) {

		int num1, num2, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe dois numeros - -");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 < num2) {
			resultado = num2 / num1;
			
			if (num2 == (resultado * num1)) {
				System.out.println("Sao multiplos");
			}
			else {
				System.out.println("Nao sao multiplos");
			}
		}
		else{
			resultado = num1 / num2;
			
			if (num1 == (resultado * num2)) {
				System.out.println("Sao multiplos");
			}else {
				System.out.println("Nao sao multiplos");
			}
		}
		
		
		
		/*
		resultado = num1 * num2;
		
		if ((resultado % 2) == 0) 
			System.out.println("Sao multiplos");
		
		else if ((resultado % 3) == 0) {
			System.out.println("Sao multiplos");
		}
		else if ((resultado % 5) == 0) {
			System.out.println("Sao multiplos");
			}
			System.out.println("Nao sao multiplos");*/
			
		sc.close();
	}

}
