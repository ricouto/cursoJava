package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double pi, ladoA, ladoB, ladoC, area;
		
		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();
		pi = 3.14159;
		
		//calculo da area do triangulo
		area = (ladoA * ladoC) / 2;
		System.out.printf("A area do triangulo eh : %.3f", area );
		
		//calculo do circulo
		area = pi * (Math.pow(ladoC, 2));
		System.out.printf("%nA area do circulo eh : %.3f", area );
		
		//calculo do trapezio
		area = ((ladoA + ladoB) / 2) * ladoC;
		System.out.printf("%nA area do trapezio eh : %.3f", area );
		
		//calculo do quadrado
		area = ladoB * ladoB;
		System.out.printf("%nA area do quadrado eh : %.3f", area );
		
		//calculo do retangulo
		area = ladoA * ladoB;
		System.out.printf("%nA area do retangulo eh : %.3f", area );
		
		sc.close();
	}

}
