package estruturaWhile;
import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe os eixos X e Y - -\n");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrante Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Quadrante Q2");
		}
		else if(x > 0 && y < 0){
			System.out.println("Quadrante Q4");
		}
		else{
			System.out.println("Quadrante Q3");
		}
		
		System.out.println("- - Informe os eixos X e Y - -");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		}
		sc.close();
	}
}
