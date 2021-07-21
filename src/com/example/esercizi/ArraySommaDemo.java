package com.example.esercizi;

import java.util.Random;

public class ArraySommaDemo {

	public static void main(String[] args) {

		// 1) Generare un array di 5 posizioni double
		// 2) Inizializzare l'array a valori random double moltiplicati per 1000
		// 3) Stampare la somma dei valori contenuti negli elementi

		double[] arr = new double[5];
		Random random = new Random();
		double somma1 = 0; // Variabile per la somma totale
		double somma2 = 0; // Variabile per la somma degli elementi con indice dispari

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1000 * random.nextDouble();
			somma1 += arr[i];
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		for (int i = 1; i < arr.length; i = i + 2) {
			somma2 += arr[i];
		}

		System.out.println("\nLa somma dei valori è " + somma1);
		System.out.println("La somma dei valori con indice dispari è " + somma2);

	}

}
