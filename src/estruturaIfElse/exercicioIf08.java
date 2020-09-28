package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf08 {

	public static void main(String[] args) {

		double salFunc, impPagar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe o valor do salario para o calculo do IR em Lisarb - -");
		salFunc = sc.nextDouble();
		
		
		if(salFunc <= 2000) 
			impPagar = 0.0;
		else if(salFunc <= 3000) 
			impPagar =  (salFunc - 2000) * 0.08;
		else if(salFunc <= 4500) 
			impPagar =  (1000 * 0.08) + (salFunc - 3000) * 0.18;
		else 
			impPagar =  (1000 * 0.08) + (1500 * 0.18) + ((salFunc - 4500)  * 0.28);
		
		if(impPagar == 0)
			System.out.println("Isento");
		else
			System.out.printf("Imposto a pagar eh R$ %.2f", impPagar);
		
		sc.close();
	}
	
}
