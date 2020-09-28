package estruturaWhile;
import java.util.Scanner;

public class ExercicioWhile03 {

	public static void main(String[] args) {
		int x, combAlcool = 0, combGasolina = 0, combDiesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe tipo de combustível abastecido - -");
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		x = sc.nextInt();
		
		while (x != 4) {
		
		if(x == 1) {
			combAlcool += +1;
		}
		else if(x == 2) {
			combGasolina += +1;
		}
		else if(x == 3){
			combDiesel += +1;
		}
		
		System.out.println("- - Informe tipo de combustível abastecido - -");
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		x = sc.nextInt();
		
		}
		
		if(x == 4) {
			System.out.println("Muito Obrigado!");
			System.out.println("Alcool : " + combAlcool);
			System.out.println("Gasolina : " + combGasolina);
			System.out.println("Diesel : " + combDiesel);
		}
		
		sc.close();
	}
}
