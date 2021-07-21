package com.example.geometria;

public class Ellisse extends FormaGeometrica {

	private double a, b;	// Semiasse maggiore e Semiasse minore

	public Ellisse(double a, double b) {	// Costruttore
		this.a = a;
		this.b = b;
	}

	public double area() {
		double area = Math.PI * a * b;
		System.out.println("Area = " + area);
		return area;
	}

	public double perimetro() {
		double perimetro = (Math.PI * 2) * Math.sqrt(((a * a) + (b * b)) / 2);
		System.out.println("Perimetro = " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiasseA=");
		builder.append(a);
		builder.append(", semiasseB=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}

}
