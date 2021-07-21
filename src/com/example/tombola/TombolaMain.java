package com.example.tombola;

public class TombolaMain {

	public static void main(String[] args) {

		Tombola tombola = new Tombola();

		for (int i = 0; i < 90; i++) {
			if(i%20 == 0 && i > 0) {
				System.out.println("\n-----Tabellone-----\n\n" + tombola.tabellone());
				System.out.println("--------------------\n");
			}
			System.out.println(i+1 + "° Estrazione: " + tombola.estrai());
		}
		System.out.println("\n-----Tabellone-----\n\n" + tombola.tabellone());
	}
}
