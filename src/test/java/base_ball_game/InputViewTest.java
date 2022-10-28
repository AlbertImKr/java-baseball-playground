package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InputViewTest {

	@Test
	void check_number_right() {
		int num1 = 10;
		assertThat(InputView.checkNumber(num1)).isFalse();

		int num2 = 222;
		assertThat(InputView.checkNumber(num2)).isTrue();

		int num3 = 24234;
		assertThat(InputView.checkNumber(num3)).isFalse();
	}

}
