package baseball;

import java.util.List;

public class RightList {
	private final int SIZE = 3;

	public boolean checkRange(List<Integer> userList) {
		return userList.size() == this.SIZE;
	}

	public boolean checkRepeat(List<Integer> userList) {
		long count = userList.stream()
			.distinct()
			.count();
		return count != userList.size();
	}

	public boolean checkZero(List<Integer> userList) {
		return userList.stream()
			.anyMatch(integer -> integer == 0);
	}

	public boolean checkAll(List<Integer> userNumberList) {
		return checkRange(userNumberList)
			&& !checkRepeat(userNumberList)
			&& !checkZero(userNumberList);
	}
}
