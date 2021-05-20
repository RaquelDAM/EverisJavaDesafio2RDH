package operators;

public class Ball {

	private String ball;
	private long point = 150;
	private int plus;

	/** Constructor para bolas */
	public Ball(String ball, int plus) {

		this.setBall(ball);
		this.setPlus(plus);
		this.point = point * plus;
	}

	public long getPoint() {
		return point;
	}

	public void setPoint(long point) {
		this.point = point;
	}

	public String getBall() {
		return ball;
	}

	public void setBall(String ball) {
		this.ball = ball;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

}
