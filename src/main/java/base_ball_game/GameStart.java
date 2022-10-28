package base_ball_game;

import java.util.ArrayList;
import java.util.List;

public class GameStart {
	private static final List<Integer> numberList = new ArrayList<>();
	private final static int MAX_SIZE = 3;
	private static final int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public GameStart() {
		for (int i = 0; i < MAX_SIZE; i++) {
			int temp = list[(int)(Math.random() * 8)];
			numberList.add(temp);
		}
	}

	public static List<Integer> getNumberList() {
		return List.copyOf(numberList);
	}
}
