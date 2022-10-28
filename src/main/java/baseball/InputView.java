package baseball;

import java.util.Scanner;

public class InputView {
	private final static Scanner scanner = new Scanner(System.in);

	public int getNumber() {
		System.out.println("\n숫자를 입력하세요.");
		return scanner.nextInt();
	}

	public boolean restart() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		int nextInt = scanner.nextInt();
		return nextInt == 1;
	}
}
