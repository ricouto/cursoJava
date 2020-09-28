package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.print("Name: ");
		aluno.name = sc.next();
		
		for (int i=1;i<4;i++) {
			System.out.print("Digite a " + i + " nota do aluno : ");
			double nota = sc.nextDouble();
			aluno.recebeNotas(nota);
		}
		
		System.out.println(aluno);//fiz de outra forma para ver o retorno
		
		aluno.calculaNotas();
		
		sc.close();
	}

}
