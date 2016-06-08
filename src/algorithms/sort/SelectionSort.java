package algorithms.sort;

public class SelectionSort implements Sort {

	public void sort(int[] array) {
		int minValue;
		int index;
		for (int i = 0; i < array.length; i++) {
			minValue = array[i];
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (minValue > array[j]) {
					minValue = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = minValue;
		}
	}

	public String toString() {
		return "SelectionSort";

	}
}
