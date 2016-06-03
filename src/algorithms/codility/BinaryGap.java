package algorithms.codility;

public class BinaryGap { // // Codility result: 100%

	public int solution(int N) {
		String binaryString = Integer.toBinaryString(N);
		int lenghtOfBinaryString = binaryString.length();
		int numberForList = 0;
		int maxValue = 0;

		for (int i = 0; i < lenghtOfBinaryString; i++) {
			if (binaryString.charAt(i) == '0') {
				++numberForList;
				if (i + 1 != lenghtOfBinaryString && binaryString.charAt(i + 1) == '1') {
					if (numberForList > maxValue) {
						maxValue = numberForList;

					}
					numberForList = 0;

				}
			}

		}
		return maxValue;

	}

}
