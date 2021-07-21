package com.example.geometria;

public class Quadrato extends Rettangolo {

	private double lato;

	public Quadrato(double lato) {
		super(lato, lato);
		this.lato = lato;
	}

	public double area() {
		double area = lato * lato;
		System.out.println("Area = " + area);
		return area;
	}

	public double perimetro() {
		double perimetro = lato * 4;
		System.out.println("Perimetro = " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrato [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}

	@SuppressWarnings("unused")
	private void faiQualcosa02() {
		System.out.println("faiQualcosa02 di Quadrato");
	}

	@Override
	protected void faiQualcosa03() {
		System.out.println("faiQualcosa03 di Quadrato");
	}

	public void faiQualcosa() {
		faiQualcosa03();
	}

	public void faiQualcosa04() {
		System.out.println("faiQualcosa04 di Quadrato");
	}	

}
