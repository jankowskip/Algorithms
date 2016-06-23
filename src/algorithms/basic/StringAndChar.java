package algorithms.basic;

public class StringAndChar {

	public int checkString(String s, char c) {
		if(s==null){
			return 0;
		}
		s = s.toLowerCase();
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

