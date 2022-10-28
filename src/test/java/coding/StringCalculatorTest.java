package coding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringCalculatorTest {

	@ParameterizedTest
	@ValueSource(strings = {"2 + 3 * 4 / 2"})
	void string_calculator(String str) {
		Assertions.assertEquals(StringCalculator.calculate(str), 10);
	}
}
