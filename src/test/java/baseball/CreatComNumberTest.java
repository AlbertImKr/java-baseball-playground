package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CreatComNumberTest {

	@Test
	void creat_number_0_9() {
		CreatComNumber number = new CreatComNumber();
		List<Integer> numberList = number.getComNumberList();
		for (Integer integer : numberList) {
			assertThat(integer).isLessThanOrEqualTo(9).isGreaterThanOrEqualTo(1);
		}
	}

}
