package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BallsTest {

	@Test
	void strike(){
		List<Integer> list = List.of(3, 4, 5);
		Balls balls = new Balls(list);
		assertThat(balls.play(new Ball(0, 3))).isEqualTo(BallStatus.STRIKE);
	}

	@Test
	void ball(){
		List<Integer> list = List.of(3, 4, 5);
		Balls balls = new Balls(list);
		assertThat(balls.play(new Ball(0, 4))).isEqualTo(BallStatus.BALL);
	}

	@Test
	void nothing(){
		List<Integer> list = List.of(3, 4, 5);
		Balls balls = new Balls(list);
		assertThat(balls.play(new Ball(0, 6))).isEqualTo(BallStatus.NOTHING);
	}

}
