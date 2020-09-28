package estruturaIfElse;
import java.util.Scanner;

public class exercicioIf04 {

	public static void main(String[] args) {

		int horaInicio, horaFim, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - Informe a hora de inicio e termino do jogo - -");
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if(horaInicio < 0 || horaInicio > 24 || horaFim < 0 || horaFim > 24) 
			System.out.println("Hora informada eh invalida!");
		
		else if(horaInicio == horaFim)
			System.out.println("Duracao minima eh de uma (1) hora!");
			
		else if(horaInicio >= horaFim) {
			resultado = Math.abs((24 - horaInicio)) + Math.abs((0 - horaFim));
			System.out.println("O jogo durou " + resultado + " hora(s)");
		}
		else {
			resultado = Math.abs(horaInicio - horaFim);
			System.out.println("O jogo durou " + resultado + " hora(s)");
		}
			
		sc.close();
	}

}
