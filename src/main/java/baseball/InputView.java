package baseball;

import java.util.Scanner;

public class InputView {
	private final static Scanner scanner = new Scanner(System.in);

	public int getNumber() {
		System.out.println("숫자를 입력하세요.");
		return scanner.nextInt();
	}
}
