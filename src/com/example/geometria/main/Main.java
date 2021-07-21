package com.example.geometria.main;

import com.example.geometria.*;

public class Main {

	public static void main(String[] args) {

		double areaTotale = 0;
		double perimetroTotale = 0;

		System.out.println("	Rettangolo\n");
		
		Rettangolo r = new Rettangolo(20, 50);
		areaTotale += r.area();
		perimetroTotale += r.perimetro();

		System.out.println("\n	Cerchio\n");

		Cerchio c = new Cerchio(15.4);
		areaTotale += c.area();
		perimetroTotale += c.perimetro();

		System.out.println("\n	Quadrato\n");

		Quadrato q = new Quadrato(50);
		areaTotale += q.area();
		perimetroTotale += q.perimetro();

		System.out.println("\n	Ellisse\n");

		Ellisse e = new Ellisse(15.4, 15.4);
		areaTotale += e.area();
		perimetroTotale += e.perimetro();

		System.out.println("\n	Totale dei valori");
		System.out.println("\nArea totale = " + areaTotale);
		System.out.println("Perimetro totale = " + perimetroTotale);
		System.out.println("\nQuesto è un " + q);
		System.out.println("Questo è un " + c);
		System.out.println("Questo è un " + r);
		System.out.println("Questo è un " + e);
		System.out.println();

		//		q.faiQualcosa01();
		//		q.faiQualcosa();
		//		q.faiqualcosa05();

	}

}
