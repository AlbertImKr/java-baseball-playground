package baseball;

import java.util.List;

public class BaseballGame {

	private static Balls comBalls;
	private static InputView inputView;
	private static RightList rightList;
	private static Change change;

	public BaseballGame() {
		List<Integer> comNumberList = new CreatComNumber().getComNumberList();
		comBalls = new Balls(comNumberList);
		inputView = new InputView();
		rightList = new RightList();
		change = new Change();
	}

	public static void start() {
		int number = inputView.getNumber();
		List<Integer> userNumberList = change.intToList(number);
		checkInputRight(userNumberList);
	}

	private static void checkInputRight(List<Integer> userNumberList) {
		if (rightList.checkRange(userNumberList)
			&& !rightList.checkRepeat(userNumberList)
			&& !rightList.checkZero(userNumberList)) {
			compareToComNumberList(userNumberList);
		} else {
			start();
		}
	}

	private static void compareToComNumberList(List<Integer> userNumberList) {
		PlayResult play = comBalls.play(userNumberList);
		int ballNum = play.getBall();
		int strikeNum = play.getStrike();
		System.out.print(ballNum == 0 ? "" : (ballNum + "볼"));
		System.out.print(strikeNum == 0 ? "" : (strikeNum + "스트라이크"));
		if (play.isEnd()) {
			endGame();
		} else {
			start();
		}
	}

	private static void endGame() {
		if (inputView.restart()) {
			BaseballGame baseballGame = new BaseballGame();
			start();
		}

	}
}
