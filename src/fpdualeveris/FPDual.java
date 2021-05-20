package fpdualeveris;

import operators.Pinball;

/**
 * Clase con método main para ejecutar el juego
 * 
 * @author rdiahern
 *
 */
public class FPDual {

	/**
	 * Método principal de la clase FPDual
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		operatorsChallenge();
	}

	/**
	 * Ejecución del juego de Painball
	 */
	private static void operatorsChallenge() {

		// Ejecución del juego.
		Pinball p = new Pinball();
		p.playGame();
	}
}
