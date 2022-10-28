package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CreatComNumber {
	private final Balls comBalls;
	private final int N = 3;
	private final int MAX = 9;

	public CreatComNumber() {
		ArrayList<Integer> numberList = getIntegers();
		comBalls = new Balls(numberList);
	}

	ArrayList<Integer> getIntegers() {
		Set<Integer> list = new HashSet<>();
		Random random = new Random();
		while (list.size() != N) {
			int n = random.nextInt(MAX) + 1;
			list.add(n);
		}
		return new ArrayList<>(list);
	}

	public Balls getBalls() {
		return comBalls;
	}
}
