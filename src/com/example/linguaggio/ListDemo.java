package com.example.linguaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ListDemo {

	private static final Logger log = LogManager.getLogger(ListDemo.class);

	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> lista = new ArrayList<>();

		log.debug("Numero elementi in lista alla fine : " + lista.size());
		for (Integer i = 0; i < 1000; i++) {
			int generato = random.nextInt();
			lista.add(generato);
			log.debug("Numero generato {} Numero elementi in lista è {} ", generato, lista.size());
		}
		log.info("Numero elementi in lista alla fine {} ", lista.size());
		if (lista.size() <= 0) {
			log.fatal("Problema con l'implementazione di List abosrt...");
			throw new RuntimeException("List implementation not working");
		}
	}
}