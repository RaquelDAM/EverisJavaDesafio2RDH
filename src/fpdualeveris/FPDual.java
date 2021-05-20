package fpdualeveris;

import operators.Pinball;

/**
 * Clase con m�todo main para ejecutar el juego
 * 
 * @author rdiahern
 *
 */
public class FPDual {

	/**
	 * M�todo principal de la clase FPDual
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		operatorsChallenge();
	}

	/**
	 * Ejecuci�n del juego de Painball
	 */
	private static void operatorsChallenge() {

		// Ejecuci�n del juego.
		Pinball p = new Pinball();
		p.playGame();
	}
}
