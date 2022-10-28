package base_ball_game;

import java.util.Scanner;

public class InputView {
	public static int RequestNumber() {
		System.out.println("숫자를 입력해 주세요 :");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
