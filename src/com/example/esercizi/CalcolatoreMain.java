package com.example.esercizi;

import com.example.linguaggio.Calcolatore;

public class CalcolatoreMain {

	public static void main(String[] args) {

		Calcolatore c = new Calcolatore();

		int a = 10;
		int b = 8;
		
		System.out.println(a + " + " + b + " = " + c.somma(a, b));

		System.out.println(a + " - " + b + " = " + c.sottrazione(a, b));

	}

}
