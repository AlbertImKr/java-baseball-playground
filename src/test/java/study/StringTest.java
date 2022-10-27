package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
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

	@Test
	void erase_bracket_test() {
		String text = "(1,2)";
		String answer = text.substring(1, text.length() - 1);
		assertThat(answer).isEqualTo("1,2");
	}

	@Test
	@DisplayName("문자 범위초과시 Exception 발생하는지 확인")
	void throw_string_index_out_of_bounds_exception() {
		String text = "abc";
		assertThatThrownBy(() -> text.charAt(4)).isInstanceOf(StringIndexOutOfBoundsException.class);
	}
}
