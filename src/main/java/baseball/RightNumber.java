package baseball;

public class RightNumber {

	public static final int MAXRANGE = 9;
	public static final int MINRANGE = 1;

	public boolean verify(int n) {
		return n <= MAXRANGE && n >= MINRANGE;
	}
}
