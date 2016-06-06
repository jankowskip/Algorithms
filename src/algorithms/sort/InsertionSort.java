package algorithms.sort;

public class InsertionSort implements Sort {

	public int[] sort(int[] array) {
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} else {
					break;
				}
			}
		}

		return array;

	}

	public String toString() {
		return "InsertionSort";
	}
}
