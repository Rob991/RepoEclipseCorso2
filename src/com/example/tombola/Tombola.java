package com.example.tombola;

import java.util.Random;

import prova.example.tombola.matrici.OrganizzazioneMatrice;
import prova.example.tombola.matrici.OrganizzazioneMatriceUtility;

/**
 * Crea un tabellone della tombola Metodi: Costruttore => inizializzare Integer
 * estrai() void reset() String tabellone()
 * 
 * @author corso
 *
 */
public class Tombola {

	private static final int COLONNE_TABELLONE = 10;
	private static final int RIGHE_TABELLONE = 9;
	private static final int DIMENSIONE_TOMBOLA = RIGHE_TABELLONE * COLONNE_TABELLONE;
	private Integer[][] estrazioni = null;
	private Random random = new Random();
	private Integer indiceOrdineDiEstrazione = 0;
	private Integer[] estrazioniInOrdineDiEstrazione = null;
	private OrganizzazioneMatriceUtility utility = OrganizzazioneMatriceUtility
			.createUtility(OrganizzazioneMatrice.ROW_MAJOR);

	private void init() {
		this.estrazioni = new Integer[RIGHE_TABELLONE][COLONNE_TABELLONE];
		for (int i = 0; i < RIGHE_TABELLONE; i++) {
			for (int j = 0; j < COLONNE_TABELLONE; j++) {
				estrazioni[i][j] = 0;
			}
		}
		this.indiceOrdineDiEstrazione = 0;
		this.estrazioniInOrdineDiEstrazione = new Integer[RIGHE_TABELLONE * COLONNE_TABELLONE];
	}

	public Tombola() {
		this.init();
	}

	public void reset() {
		this.init();
	}

	public int estrai() {
		int estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
		int index = estratto - 1;
		int[] rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
		int row = rowColumn[0];
		int column = rowColumn[1];
		while (estrazioni[row][column] != 0) {
			estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
			index = estratto - 1;
			rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
			row = rowColumn[0];
			column = rowColumn[1];
		}
		estrazioni[row][column] = estratto;
		estrazioniInOrdineDiEstrazione[indiceOrdineDiEstrazione++] = estratto;
		return estratto;
	}

	public String tabellone() {
		// TODO
		StringBuilder sb = new StringBuilder(); // StringBuffer();
		for (int i = 0; i < RIGHE_TABELLONE; i++) {
			for (int j = 0; j < COLONNE_TABELLONE; j++) {
				if (estrazioni[i][j] == 0) {
					sb.append("|  |");
				} else {
					sb.append("|").append(estrazioni[i][j]).append("| ");
				}
			}
			sb.append("\n\n");
		}
		return sb.toString();
	}
}
