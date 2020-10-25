package vetoresListas;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetorExercicio;

public class VetorExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductVetorExercicio[] vect = new ProductVetorExercicio[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int x = 0; x < n; x++) {
			sc.nextLine();
			int rentNumber = x + 1;
			System.out.println("Rent #" + rentNumber +":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int number = sc.nextInt();
			vect[number] = new ProductVetorExercicio(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		
		for(int x = 0; x < vect.length; x++) {
			
			if(vect[x] != null) {
				System.out.println(x +": "+ vect[x].getName() +", "+ vect[x].getEmail());
			}
		}
		sc.close();
	}
}
