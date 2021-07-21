package com.example.esercizi;

import java.util.Random;

public class Tombola3 {

	private static final int DIMENSIONE_TOMBOLA = 90; // costante

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeriEstratti = new int[DIMENSIONE_TOMBOLA];
		int indiceNumEstratti = 0;

		// SISTEMA 1
		// condizioni iniziali => array di numeri estratti tutti uguali a 0
		for (int i = 0; i < DIMENSIONE_TOMBOLA; i++) { // generare numeri.length diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// il numero è già stato estratto ==> numeriEstratti[estratto] diverso da zero
			// no => il numero è valido,
			// 		memorizza il numero in numeriEstratti ==> numeriEstratti[estratto] = estratto
			// 		saltare al ciclo successivo
			// si => genero un nuovo numero fino a che non è un numero valido
			// memorizza il numero in numeriEstratti
			// saltare al ciclo successivo
		}

		// SISTEMA 2
		for (int i = 0; i < DIMENSIONE_TOMBOLA; i++) {
			numeriEstratti[i] = i + 1;
		}
		for (int i = 0; i < DIMENSIONE_TOMBOLA; i++) { // genera DIMENSIONE_TOMBOLA numeri diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// il numero è già stato estratto
			// no => il numero è valido
			// numeroValido = numeriEstratti[estratto]
			// numeriEstratti[estratto] = 0;
			// saltare al ciclo successivo
			// si => genero un nuovo numero fino a che non è un numero valido
			// memorizza il numero in numeriEstratti
			// saltare al ciclo successivo

		}

		// SISTEMA 3
		for (int i = 0; i < DIMENSIONE_TOMBOLA; i++) { // genera DIMENSIONE_TOMBOLA numeri diversi
			int estratto = random.nextInt(DIMENSIONE_TOMBOLA);
			// for(int j = 0; j < i; j++){
			// if(numeriEstratti[i] == estratto){
			// genero un nuovo numero
			// ripeto il for di controllo
			// else
			// numeriEstratti[i] = estratto
			// salto al ciclo successivo
		}
	}

	private static boolean numeroGiaPresente(int[] array, int numero) {
		for (int elemento : array) {
			if (numero == elemento) {
				return true;
			}
		}
		return false;
	}
}
