package base_ball_game;

import java.util.ArrayList;
import java.util.List;

public class Game {
	public static List<Integer> compareNum(int n, List<Integer> numberList) {
		List<Integer> list = new ArrayList<>();
		int strikeCount = 0;
		int ballCount = 0;
		for (int i = 0; i < numberList.size(); i++) {
			int temp = n % 10;
			strikeCount += Strike(temp, numberList.get(numberList.size()-1-i));
			ballCount += Ball(temp, numberList, numberList.size()-1-i);
			n /= 10;
		}
		list.add(strikeCount);
		list.add(ballCount);
		return list;
	}

	static int Ball(int num, List<Integer> numberList, int index) {
		if (num == numberList.get(index)) {
			return 0;
		}
		if (numberList.contains(num)) {
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
