package algorithms.sort;

public class SelectionSort implements Sort{

	public int[] sort(int[] array) {
		int minValue = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			minValue = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (minValue > array[j]) {
					minValue = array[j];
					index = j;
				}

			}
			array[index] = array[i];
			array[i] = minValue;

		}
		return array;

	}
}
