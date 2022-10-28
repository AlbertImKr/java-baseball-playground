package baseball;

public enum BallStatus {
	STRIKE, NOTHING, BALL;

	public boolean isNotNothing() {
		return this != NOTHING;
	}
}
