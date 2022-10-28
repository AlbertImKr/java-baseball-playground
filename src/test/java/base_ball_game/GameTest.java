package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void strike_same_number_return_1_not_return_0() {
		assertThat(Game.Strike(1, 1)).isEqualTo(1);
		assertThat(Game.Strike(1, 2)).isEqualTo(0);
	}

	@Test
	void ball_number_check() {
		int[] list1 = {1, 2, 3};
		assertThat(Game.Ball(1, list1, 0)).isEqualTo(0);
		assertThat(Game.Ball(1, list1, 1)).isEqualTo(1);
		assertThat(Game.Ball(4, list1, 2)).isEqualTo(0);
	}

}
