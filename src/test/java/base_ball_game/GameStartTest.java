package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameStartTest {

	@Test
	void check_number_list() {
		GameStart gameStart = new GameStart();
		for (Integer integer : gameStart.getNumberList()) {
			System.out.println(integer);
			assertThat(integer).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(10);
		}
	}
}
