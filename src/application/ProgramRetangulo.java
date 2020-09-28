package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangulo width and heigth: ");
		System.out.print("Width: ");
		retangulo.width = sc.nextDouble();
		System.out.print("Height: ");
		retangulo.heigth = sc.nextDouble();
		
		System.out.println("AREA: " + retangulo.area());
		System.out.println("PERIMETER: " + retangulo.perimeter());
		System.out.println("DIAGONAL: " + retangulo.diagonal());
		
		
		sc.close();
	}

}
