package base_ball_game;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static void requestNumber(int[] numberList) {
		int n = 0;
		while (!checkNumber(n)) {
			System.out.println("숫자를 입력해 주세요 :");
			n = scanner.nextInt();
		}
		Game.compareNum(n, numberList);
	}

	static boolean checkNumber(int n) {
		return n <= 1000 && n >= 100;
	}

	public static void restartOrNot() {
		System.out.println("게임을 새로 사작하려면 1, 종료하려면 2를 입력하세요.");
		int n = scanner.nextInt();
		if (n == 1) {
			new GameStart();
		}
	}
}
