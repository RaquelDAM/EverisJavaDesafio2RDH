package operators;

import java.util.Random;

/**
 * M�todo principal de la clase Pinball
 * 
 * @author rdiahern
 *
 */
public class Pinball {

	public void playGame() {

		// Pelota de juego.
		final Ball ballGame = selectBall();

		// Mensaje de salida
		startMessage();

		// ELSE IF para aumentar o disminuir puntuaci�n.
		if (ballGame.getPlus() > 2) {
			addPoints(ballGame);
		} else {
			subPoints(ballGame);
		}

		// A�ade puntos en funci�n del plus de la bola.
		addPointsByPlusWithLoop(ballGame);

		// Aviso de baja puntuaci�n.
		shortPoints(ballGame);

		// A�ade plus por alta puntuaci�n.
		highPoints(ballGame);

		// Mostrar puntuaci�n.
		showScore(ballGame);

	}

	/**
	 * M�todo para la elecci�n de bola SWITCH CASE
	 */
	public Ball selectBall() {

		// Generar pelota.
		Random select = new Random();
		int random = select.nextInt(4);

		// Pelota de juego.
		Ball ballGame = null;

		switch (random) {

		case 0: {
			ballGame = new Ball("Green", 1);
			break;
		}
		case 1: {
			ballGame = new Ball("Red", 2);
			;
			break;
		}
		case 2: {
			ballGame = new Ball("Purple", 3);
			;
			break;
		}
		case 3: {
			ballGame = new Ball("Yellow", 4);
			;
			break;
		}
		default: {
			System.out.println("La bola no asociada.");
		}

		}

		return ballGame;
	}

	/**
	 * WHILE con mensaje de cuenta atr�s
	 */
	private void startMessage() {
		// Iniciamos la cuenta atr�s en 3
		int x = 3;
		System.out.println("El juego comienza en... ");
		while (x >= 1) {
			System.out.println(x + "...");
			x--;
		}
		System.out.println("GO!!!");
	}

	/**
	 * FOR que a�ade puntos
	 * 
	 * @param ballGame
	 */
	private void addPointsByPlusWithLoop(final Ball ballGame) {
		for (int i = 2; i <= ballGame.getPlus(); i++) {
			addPoints(ballGame);
		}
	}

	/**
	 * M�todo para sumar puntos
	 * 
	 * @author rdiahern
	 */
	private void addPoints(Ball ballGame) {
		ballGame.setPoint(ballGame.getPoint() + 55);
	}

	/**
	 * M�todo para restar puntos
	 */
	private void subPoints(Ball ballGame) {
		ballGame.setPoint(ballGame.getPoint() - 35);
	}

	/**
	 * M�todo para avisar de puntuaci�n baja
	 * 
	 * @param ballGame
	 */
	private static void shortPoints(Ball ballGame) {
		if (ballGame.getPoint() <= 300) {
			System.out.println("Sigue practicando porque juegas muy mal!!");
		}
	}

	/**
	 * M�todo para avisar de puntuaci�n alta
	 * 
	 * @param ballGame
	 */
	private static void highPoints(Ball ballGame) {
		if (ballGame.getPoint() > 550 || ballGame.getPoint() < 750) {
			ballGame.setPoint(ballGame.getPoint() + 80);
			System.out.println("Has ganado un plus de 80 puntos, ahora tienes : " + ballGame.getPoint() + " puntos!!");
		}
	}

	/**
	 * M�todo final que muestra puntuaci�n
	 * 
	 * @param ballGame
	 */
	private static void showScore(Ball ballGame) {
		System.out.println("Su puntuaci�n final es --> " + ballGame.getPoint());
	}
}
