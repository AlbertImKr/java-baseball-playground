package base_ball_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
	public static void compareNum(int n, int[] numberList) {
		List<Integer> list = new ArrayList<>();
		int strikeCount = 0;
		int ballCount = 0;
		for (int i = 0; i < numberList.length; i++) {
			int temp = n % 10;
			strikeCount += Strike(temp, numberList[numberList.length - 1 - i]);
			ballCount += Ball(temp, numberList, numberList.length - 1 - i);
			n /= 10;
		}
		list.add(strikeCount);
		list.add(ballCount);
		OutputView.of(list, numberList);
	}

	static int Ball(int num, int[] numberList, int index) {
		if (num == numberList[index]) {
			return 0;
		}
		if (Arrays.stream(numberList).anyMatch(value -> value == num)) {
			return 1;
		}
		return 0;
	}

	static int Strike(int num1, int num2) {
		if (num1 == num2) {
			return 1;
		}
		return 0;
	}
}
