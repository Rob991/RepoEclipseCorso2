package com.example.linguaggio;

import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {

		int [] arr1 = new int[10];
		int arr2 [] = new int[10];
		int arr3 [] = {12, 55, -7, 78};

		System.out.println("arr1.lenght = " + arr1.length);
		System.out.println("arr2.lenght = " + arr2.length);
		System.out.println("arr3.lenght = " + arr3.length);		

		//		System.out.println("arr3.[4] = " + arr3[4]);	ERRORE

		//		System.out.println("arr3.[0] = " + arr3[0]);
		//		System.out.println("arr3.[0] = " + arr3[1]);
		//		System.out.println("arr3.[0] = " + arr3[2]);
		//		System.out.println("arr3.[0] = " + arr3[3]);

		System.out.println();

		for(int i = 0; i < arr3.length; i++){
			System.out.println("arr3.[" + i + "] = " + arr3[i]);	
		}

		System.out.println();

		for(int i = 0; i < arr1.length; i++){
			arr1[i] = i;
			System.out.println("arr1.[" + i + "] = " + arr1[i]);	
		}

		System.out.println();
		Random random = new Random();

		for(int i = 0; i < arr2.length; i++){
			arr2[i] = random.nextInt();
			System.out.println("arr2.[" + i + "] = " + arr2[i]);	
		}
	}

}