package coding;

import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		calculate(value);
	}

	public static int calculate(String value) {
		String[] values = value.split(" ");

		int result = Integer.parseInt(values[0]);
		for (int i = 2; i < values.length; i += 2) {
			String temp = values[i - 1];
			switch (temp) {
				case "+":
					result += Integer.parseInt(values[i]);
					break;
				case "-":
					result -= Integer.parseInt(values[i]);
					break;
				case "/":
					result /= Integer.parseInt(values[i]);
					break;
				case "*":
					result *= Integer.parseInt(values[i]);
					break;
			}
		}
		return result;
	}
}
