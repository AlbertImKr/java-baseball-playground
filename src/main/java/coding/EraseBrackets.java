package coding;

public class EraseBrackets {
	public static String erase(String str) {

		if (str.charAt(str.length()-1) == ')') {
			str = str.substring(0, str.length() - 1);
		}

		if (str.charAt(0) == '(') {
			str = str.substring(1);
		}

		return str;
	}
}
