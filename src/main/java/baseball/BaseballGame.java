package baseball;

import java.util.List;

public class BaseballGame {

	private static Balls comBalls;
	private static InputView inputView;
	private static RightList rightList;
	private static Change change;

	public BaseballGame() {
		inputView = new InputView();
		rightList = new RightList();
		change = new Change();
	}

	void startGuess() {
		int number = inputView.getNumber();
		List<Integer> userNumberList = change.intToList(number);
		checkInputRight(userNumberList);
	}

	void getNewComBalls(){
		CreatComNumber creatComNumber = new CreatComNumber();
		comBalls = creatComNumber.getBalls();
	}

	private void checkInputRight(List<Integer> userNumberList) {
		if (rightList.checkAll(userNumberList)) {
			compareToComNumberList(userNumberList);
			return;
		}
		startGuess();
	}

	private void compareToComNumberList(List<Integer> userNumberList) {
		PlayResult playResult = comBalls.play(userNumberList);
		System.out.println(playResult);
		endGameOrNOt(playResult);
	}

	private void endGameOrNOt(PlayResult playResult) {
		if (playResult.isEnd()) {
			endGame();
			return;
		}
		startGuess();
	}

	private void endGame() {
		if (inputView.restart()) {
			getNewComBalls();
			startGuess();
		}
	}
}
