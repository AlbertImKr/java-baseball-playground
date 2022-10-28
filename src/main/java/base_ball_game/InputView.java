package base_ball_game;

import java.util.Scanner;

public class InputView {
	public static int requestNumber() {
		int n = 0;
		while (!checkNumber(n)) {
			System.out.println("숫자를 입력해 주세요 :");
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
		}
		return n;
	}

	static boolean checkNumber(int n) {
		return n <= 1000 && n >= 100;
	}
}
