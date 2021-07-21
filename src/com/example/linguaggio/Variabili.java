package com.example.linguaggio;

public class Variabili {

	// int, long, float, char, byte, double, boolean   --TIPO PRIMITIVO--

	// String => classe

	private int valore = 0; // Variabile di stato o di istanza

	private void do1() {
		valore += 1;
	}

	private void do2() {
		valore -= 10;
	}

	private void stampa() {
		System.out.println("Valore = " + valore);
	}

	public static void main(String[] args) {
		Variabili v = new Variabili();

		v.do1();
		v.stampa();

		v.do2();
		v.stampa();

		//		var yy = (float) 800.98;
	}

}
