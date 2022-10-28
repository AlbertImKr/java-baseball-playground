package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void strike_same_number_return_1_not_return_0() {
		assertThat(Game.Strike(1, 1)).isEqualTo(1);
		assertThat(Game.Strike(1, 2)).isEqualTo(0);
	}

	@Test
	void ball_number_check() {
		List<Integer> list1 = List.of(1, 2, 3);
		assertThat(Game.Ball(1, list1, 0)).isEqualTo(0);
		assertThat(Game.Ball(1, list1, 1)).isEqualTo(1);
		assertThat(Game.Ball(4, list1, 2)).isEqualTo(0);
	}


	@Test
	void game_compare(){
		List<Integer> list1 = List.of(1, 2, 3);
		assertThat(Game.compareNum(345, list1)).isEqualTo(List.of(0, 1));

		List<Integer> list2 = List.of(1, 2, 3);
		assertThat(Game.compareNum(123, list2)).isEqualTo(List.of(3, 0));
	}

}
