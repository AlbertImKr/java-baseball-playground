package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Change {
	public List<Integer> intToList(int n) {
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}
		Collections.reverse(list);
		return list;
	}
}
