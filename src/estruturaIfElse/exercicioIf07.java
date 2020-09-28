package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf07 {

	public static void main(String[] args) {

		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe os eixos X e Y - -");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) 
			System.out.println("Origem");
		
		else if(x == 0) {
			System.out.printf("Eixo Y");
		}
		else if(y == 0) {
			System.out.printf("Eixo X");
		}
		else if(x > 0 && y > 0) {
			System.out.printf("Quadrante Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.printf("Quadrante Q2");
		}
		else if(x > 0 && y < 0){
			System.out.printf("Quadrante Q4");
		}
		else{
			System.out.printf("Quadrante Q3");
		}
		sc.close();
	}
}
