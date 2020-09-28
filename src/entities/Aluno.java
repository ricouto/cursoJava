package entities;

public class Aluno {

	public String name;
	public double nota;
	
	public void recebeNotas(double nota) {
		this.nota += nota;
	}
	
	public void calculaNotas() {

		if (nota < 60) {
			//System.out.printf("FINAL GRADE = %.2f%n", nota);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", Math.abs(nota -= 60));
		} else {
			//System.out.printf("FINAL GRADE = %.2f%n", nota);
			System.out.println("PASS");
		}
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f", nota);
			
	}
}
