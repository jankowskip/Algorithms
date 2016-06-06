package algorithms.sort;

public class BubbleSort implements Sort {

	public int[] sort(int[] array) {
		int temp = 0;
		boolean swapped = false;
		for (int i = 0; i < array.length; i++) {
			swapped = false;
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		return array;
	}

	public String toString() {
		return "BubbleSort";

	}

}
