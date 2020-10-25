package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matRandom = new int[n][m];

		for (int i = 0; i < matRandom.length; i++) {
			for (int j = 0; j < matRandom[i].length; j++) {
				matRandom[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter with number to find: ");
		int numberFind = sc.nextInt();

		for (int i = 0; i < matRandom.length; i++) {
			for (int j = 0; j < matRandom[i].length; j++) {

					if (matRandom[i][j] == numberFind) 
					{
						System.out.println("Position : " + i + "," + j);

						if ((i == 0 && j == 0)  || j < (matRandom[i].length -1))
							System.out.println("Direita : " + matRandom[i][j + 1]);
						
						if (  (j != 0 && i >= j) || (j != 0 && i < j)) 
							System.out.println("Esquerda : " + matRandom[i][j - 1]);

						if ((i == 0 && j == 0) || i > (matRandom.length - 1) || i < (matRandom.length - 1))
							System.out.println("Baixo : " + matRandom[i + 1][j]);
						
						if ((j == 0 && j < i) || (i != 0 && j != 0 && j > i) || (j != 0 && j <= i))
							System.out.println("Cima : " + matRandom[i - 1][j]);

						System.out.println();
					}
			}

			sc.close();
		}
	}
}

/*
 * 
 * if (j == 0 || j < (matRandom[i].length -1)) System.out.println("Direita : " +
 * matRandom[i][j + 1]);
 * 
 * if (j == 0) { } else if(j == (matRandom[i].length -1) || j <
 * (matRandom[i].length -1)) System.out.println("Esquerda : " + matRandom[i][j -
 * 1]);
 * 
 * if (i == 0) System.out.println("Baixo : " + matRandom[i + 1][j]); else if(i <
 * (matRandom.length)) System.out.println("Cima : " + matRandom[i - 1][j]);
 * 
 * if (i == 0) { } else if(i > (matRandom.length -1) || i < (matRandom.length
 * -1)) System.out.println("Baixo : " + matRandom[i + 1][j]);
 * 
 */

/*if (i == 0 && j == 0)
if (matRandom[i][j] == numberFind) 
{
	System.out.println("Position : " + i + "," + j);

	System.out.println("Direita : " + matRandom[i][j + 1]);

	System.out.println("Baixo : " + matRandom[i + 1][j]);

	System.out.println();
}

if (i != 0 || j != 0)*/