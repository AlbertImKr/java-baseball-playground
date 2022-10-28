package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
	private Ball ball;

	@BeforeEach
	void setBall() {
		ball = new Ball(1, 4);
	}

	@Test
	void ball_strike() {
		assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void ball_ball() {
		assertThat(ball.play(new Ball(2, 4))).isEqualTo(BallStatus.BALL);
	}

	@Test
	void ball_nothing() {
		assertThat(ball.play(new Ball(2, 3))).isEqualTo(BallStatus.NOTHING);
	}

}
