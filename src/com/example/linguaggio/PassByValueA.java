package com.example.linguaggio;

public class PassByValueA {
	
	public static void main(String[] args) {
		
		PassByValueA pvba = new PassByValueA();
		
		int x = 100;	// viene passato il contenuto della variabile
		System.out.println("x = " + x);
		pvba.cambiaValore(x);
		System.out.println("x = " + x);
		
	}
	
	public void cambiaValore(int k) {
		System.out.println("k = " + k);
		k = k + 100;
		System.out.println("k = " + k);
	}

}
