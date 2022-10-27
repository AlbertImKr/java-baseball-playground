package coding;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReturnValueTest {

	@Test
	void string_overflow() {
		String text = "abc";
		Assertions.assertThatThrownBy(() -> ReturnValue.from(text, 4))
			.isInstanceOf(StringIndexOutOfBoundsException.class)
			.hasMessage("문자 범위를 초과하였습니다.");
	}

}
