package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CreatComNumber {
	private final List<Integer> numberList;
	private final int N = 3;
	private final int MAX = 9;

	public CreatComNumber() {
		Set<Integer> list = new HashSet<>();
		Random random = new Random();
		while (list.size() != N) {
			int n = random.nextInt(MAX) + 1;
			list.add(n);
		}
		this.numberList = new ArrayList<>(list);
	}

	public List<Integer> getComNumberList() {
		return numberList;
	}
}
