package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	private final List<Ball> balls;

	public Balls(List<Integer> ballList) {
		this.balls = mapBall(ballList);
	}

	private static List<Ball> mapBall(List<Integer> ballList) {
		List<Ball> balls = new ArrayList<>();
		for (int i = 0; i < ballList.size(); i++) {
			balls.add(new Ball(i, ballList.get(i)));
		}
		return balls;
	}

	public BallStatus play(Ball userBall) {
		return balls.stream()
			.map(ball -> ball.play(userBall))
			.filter(BallStatus::isNotNothing)
			.findFirst()
			.orElse(BallStatus.NOTHING);

	}

	public PlayResult play(List<Integer> userList) {
		PlayResult playResult = new PlayResult();
		for (int i = 0; i < userList.size(); i++) {
			Ball newBall = new Ball(i, userList.get(i));
			BallStatus status = play(newBall);
			playResult.report(status);
		}

		return playResult;
	}
}
