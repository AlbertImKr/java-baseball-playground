package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RightListTest {

	@Test
	void list_range_3() {
		RightList rightList = new RightList();
		List<Integer> userList1 = List.of(1, 2, 3);
		assertThat(rightList.checkRange(userList1)).isTrue();

		List<Integer> userList2 = List.of(2, 3);
		assertThat(rightList.checkRange(userList2)).isFalse();

		List<Integer> userList3 = List.of(2, 3, 4, 5);
		assertThat(rightList.checkRange(userList3)).isFalse();
	}

	@Test
	void list_repeat() {
		RightList rightList = new RightList();
		List<Integer> userList1 = List.of(1, 2, 3);
		assertThat(rightList.checkRepeat(userList1)).isFalse();

		List<Integer> userList2 = List.of(2, 2, 3);
		assertThat(rightList.checkRepeat(userList2)).isTrue();
	}

	@Test
	void list_zero(){
		RightList rightList = new RightList();
		List<Integer> userList = List.of(0, 2, 3);
		assertThat(rightList.checkZero(userList)).isTrue();
	}
}
