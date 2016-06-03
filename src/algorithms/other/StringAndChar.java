package algorithms.other;

public class StringAndChar {

	public int checkString(String s, char c) {
		s.toLowerCase();
		c = Character.toLowerCase(c);
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				result++;
			}
		}
		return result;
	}
}

// oddity: in matlab 'char' is charachter array