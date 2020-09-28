package entities;

public class Retangulo {

	public double width;
	public double heigth;

	public String area() {

		double area = width * heigth;
		return String.format("%.2f", area);

	}

	public String perimeter() {

		double area = ( width * 2 ) + ( heigth * 2 );
		return String.format("%.2f", area);

	}
	
	public String diagonal() {

		double area = Math.sqrt( Math.pow(width, 2) +  Math.pow(heigth, 2));
		return String.format("%.2f", area);

	}	
	
}
