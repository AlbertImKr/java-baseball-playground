package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ChangeTest {

	@Test
	void change_int_to_list() {
		Change change = new Change();
		List<Integer> list1 = change.intToList(123);
		assertThat(list1.get(0)).isEqualTo(1);
		assertThat(list1.get(1)).isEqualTo(2);
		assertThat(list1.get(2)).isEqualTo(3);

		List<Integer> list2 = change.intToList(345);
		assertThat(list2.get(0)).isEqualTo(3);
		assertThat(list2.get(1)).isEqualTo(4);
		assertThat(list2.get(2)).isEqualTo(5);
	}
}
