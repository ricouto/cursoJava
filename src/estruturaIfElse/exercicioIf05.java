package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf05 {

	public static void main(String[] args) {

		int codItem, qtdItem;
		double precoItem;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe o codigo e a quantidade do item - -");
		codItem = sc.nextInt();
		qtdItem = sc.nextInt();
		
		if(codItem == 0 || codItem > 5 || qtdItem == 0) 
			System.out.println("Codigo e/ou quantidade do item invalida!");
		
		else if(codItem == 1) {
			precoItem = qtdItem * 4;
			System.out.printf("Valor a pagar eh R$ %.2f", precoItem);
		}
		else if(codItem == 2) {
			precoItem = qtdItem * 4.5;
			System.out.printf("Valor a pagar eh R$ %.2f", precoItem);
		}
		else if(codItem == 3) {
			precoItem = qtdItem * 5;
			System.out.printf("Valor a pagar eh R$ %.2f", precoItem);
		}
		else if(codItem == 4) {
			precoItem = qtdItem * 2;
			System.out.printf("Valor a pagar eh R$ %.2f", precoItem);
		}
		else {
			precoItem = qtdItem * 1.5;
			System.out.printf("Valor a pagar eh R$ %.2f", precoItem);
		}
		sc.close();
	}
}
