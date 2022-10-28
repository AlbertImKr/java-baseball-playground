package baseball;

import java.util.Objects;

public class Ball {

	private final int position;
	private final int value;

	public Ball(int position, int value) {
		this.position = position;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Ball))
			return false;
		Ball ball = (Ball)o;
		return position == ball.position && value == ball.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position, value);
	}

	public BallStatus play(Ball ball) {
		if (ball.equals(this)) {
			return BallStatus.STRIKE;
		}
		if (ball.mathValue(this.value)) {
			return BallStatus.BALL;
		}
		return BallStatus.NOTHING;
	}

	private boolean mathValue(int value) {
		return this.value == value;
	}

}
