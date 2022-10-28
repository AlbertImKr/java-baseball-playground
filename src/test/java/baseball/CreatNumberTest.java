package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CreatNumberTest {

	@Test
	void creat_number_0_9() {
		CreatNumber number = new CreatNumber();
		List<Integer> numberList = number.getNumberList();
		for (Integer integer : numberList) {
			assertThat(integer).isLessThanOrEqualTo(9).isGreaterThanOrEqualTo(1);
		}
	}

}
