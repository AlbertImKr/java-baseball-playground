package base_ball_game;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		GameStart gameStart = new GameStart();
		List<Integer> numberList = gameStart.getNumberList();
		int n = InputView.requestNumber();

		Game.compareNum(n, numberList);
	}
}
