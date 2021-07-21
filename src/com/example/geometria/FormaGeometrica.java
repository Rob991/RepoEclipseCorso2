package com.example.geometria;

public class FormaGeometrica {

	public double area() {
		return 0;
	}

	public double perimetro() {
		return 0;
	}
	
	public void faiQualcosa01() {
		System.out.println("faiQualcosa01 di Forma Geometrica");
	}
	
	private void faiQualcosa02() {
		System.out.println("faiQualcosa02 di Forma Geometrica");
	}
	
	protected void faiQualcosa03() {
		System.out.println("faiQualcosa03 di Forma Geometrica");
	}
	
	/*default*/ void faiQualcosa04() {
		System.out.println("faiQualcosa04 di Forma Geometrica");
	}
	
	public void faiqualcosa05() {
		faiQualcosa02();
	}

}
