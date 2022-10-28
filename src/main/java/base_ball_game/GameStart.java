package base_ball_game;

public class GameStart {
	private final static int MAX_SIZE = 3;
	private static final int[] numberList = new int[MAX_SIZE];
	private static final int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public GameStart() {
		for (int i = 0; i < MAX_SIZE; i++) {
			int temp = list[(int)(Math.random() * 8)];
			numberList[i] = temp;
		}
		InputView.requestNumber(numberList);
	}

	public static int[] getNumberList() {
		return numberList;
	}
}
