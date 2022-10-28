package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatNumber {
	private final List<Integer> numberList;
	private final int N = 3;
	private final int MAX = 9;

	public CreatNumber() {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < N; i++) {
			list.add(random.nextInt(MAX) + 1);
		}
		this.numberList = list;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}
}
