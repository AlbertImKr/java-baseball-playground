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

	@Test
	void balls_balls_match(){
		List<Integer> list = List.of(3, 4, 5);
		Balls balls = new Balls(list);

		List<Integer> userList1 = List.of(3, 4, 5);
		PlayResult result1 =  balls.play(userList1);
		assertThat(result1.getStrike()).isEqualTo(3);
		assertThat(result1.getBall()).isEqualTo(0);

		List<Integer> userList2 = List.of(7,8,9);
		PlayResult result2 =  balls.play(userList2);
		assertThat(result2.getStrike()).isEqualTo(0);
		assertThat(result2.getBall()).isEqualTo(0);

		List<Integer> userList3 = List.of(3, 6, 4);
		PlayResult result3 =  balls.play(userList3);
		assertThat(result3.getStrike()).isEqualTo(1);
		assertThat(result3.getBall()).isEqualTo(1);
	}

}
