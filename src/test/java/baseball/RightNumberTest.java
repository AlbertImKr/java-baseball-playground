package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RightNumberTest {

	@Test
	void range_1_9() {
		RightNumber number = new RightNumber();
		assertThat(number.verify(1)).isTrue();
		assertThat(number.verify(9)).isTrue();
		assertThat(number.verify(0)).isFalse();
		assertThat(number.verify(10)).isFalse();
	}
}
