package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {
	@Test
	void replace() {
		String actual = "abc".replace("b", "d");
		assertThat(actual).isEqualTo("adc");
	}

	@Test
	void split_is_working_well() {
		String testNumber1 = "1,2";
		String[] split1 = testNumber1.split(",");
		assertThat(split1).contains("1", "2");

		String testNumber2 = "1";
		String[] split2 = testNumber2.split(",");
		assertThat(split2).contains("1");
	}
}
