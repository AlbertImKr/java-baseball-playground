package baseball;

public class PlayResult {
	private int strike;
	private int ball;

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	public void report(BallStatus status) {
		if (status.isStrike()) {
			strike++;
		}
		if (status.isBall()) {
			ball++;
		}
	}

	public boolean isEnd() {
		return strike == 3;
	}

	@Override
	public String toString() {
		String ballInfo = ball == 0 ? "" : (ball + "볼");
		String strikeInfo = strike == 0 ? "" : (strike + "스트라이크");
		return ballInfo + strikeInfo;
	}
}
