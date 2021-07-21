package com.example.esercizi;

import java.util.Random;

public class Tombola {

	private static final int DIMENSIONE_TOMBOLA = 90;

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeriEstratti = new int[DIMENSIONE_TOMBOLA];

		for (int i = 0; i < DIMENSIONE_TOMBOLA; i++) {
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			while (numeriEstratti[estratto] != 0) {
				estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			}
			numeriEstratti[estratto] = estratto + 1;
			System.out.println(i + 1 + "° Estrazione: " + numeriEstratti[estratto]);
		}
	}
}