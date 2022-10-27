package coding;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EraseBracketsTest {

	@Test
	void erase_brackets() {
		String text = "(1,2)";
		assertThat(EraseBrackets.erase(text)).isEqualTo("1,2");
	}

}
