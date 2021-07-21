package com.example.geometria;

public class Cerchio extends Ellisse {

	private double raggio;

	public Cerchio(double raggio) {	// Costruttore
		super(raggio, raggio);
		this.raggio = raggio;
	}

	//	public double area() { // Calcola l'area del cerchio
	//		double area = (raggio * raggio) * Math.PI;
	//		System.out.println("Area = " + area);
	//		return area;
	//	}

	//	public double perimetro() { // Calcola il perimetro del cerchio
	//		double perimetro = (Math.PI * 2) * raggio;
	//		System.out.println("Diametro = " + perimetro);
	//		return perimetro;
	//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append("]");
		return builder.toString();
	}

}
