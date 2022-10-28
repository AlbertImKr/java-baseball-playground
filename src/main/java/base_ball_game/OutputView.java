package base_ball_game;

import java.util.List;

public class OutputView {

	public static void of(List<Integer> resultList, int[] numberList) {
		if (resultList.get(1) > 0) {
			System.out.print(resultList.get(1) + "볼");
		}
		if (resultList.get(0) > 0) {
			System.out.print(resultList.get(0) + "스트라이크");
		}
		System.out.println();
		if (resultList.get(0) == 3) {
			InputView.restartOrNot();
		}
		if (resultList.get(0) != 3) {
			InputView.requestNumber(numberList);
		}
	}
}
