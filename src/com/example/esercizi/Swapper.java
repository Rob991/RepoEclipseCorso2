package com.example.esercizi;

public class Swapper {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int temp;

		System.out.println("x = " + x + " y = " + y);

		// Swap delle variabili
		// x = 200;
		// y = 100;		

		temp = x;
		x = y;
		y = temp;

		System.out.println("x = " + x + " y = " + y);

		// swap senza terza variabile
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x = " + x + " y = " + y);
	}
}
