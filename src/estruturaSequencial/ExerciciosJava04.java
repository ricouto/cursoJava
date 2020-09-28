package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosJava04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double funcID, horas, valHora, salario;
		
		funcID = sc.nextInt();
		horas = sc.nextInt();
		valHora = sc.nextDouble();
		
		salario = horas * valHora;
		
		System.out.printf("A matricula do funcionario : %.0f%nSalario recebido eh : %.2f", funcID, salario );
		
		sc.close();
	}

}

