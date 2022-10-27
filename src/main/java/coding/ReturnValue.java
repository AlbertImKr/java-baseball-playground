package coding;

public class ReturnValue {
	public static Character from(String str, int n) {
		if (n >= str.length()) {
			throw new StringIndexOutOfBoundsException("문자 범위를 초과하였습니다.");
		}
		return str.charAt(n);
	}
}
