package algorithms.sort;

public class MergeSort implements Sort {
	private int[] array;
	private int[] tempArray;
	private int arrayLength;

	@Override
	public void sort(int[] array) {
		this.array = array;
		this.arrayLength = array.length;
		this.tempArray = new int[arrayLength];
		mergeSort(0, arrayLength - 1);
	}

	public void mergeSort(int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	public void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			tempArray[i] = array[i];
		}
		int left = low;
		int right = middle + 1;
		int current = low;

		while (left <= middle && right <= high) {
			if (tempArray[left] < tempArray[right]) {
				array[current] = tempArray[left];
				left++;
			} else {
				array[current] = tempArray[right];
				right++;
			}
			current++;
		}
		int remaining = middle - left;
		for (int i = 0; i <= remaining; i++) {
			array[current] = tempArray[left + i];
			current++;
		}

	}

	public String toString() {
		return "MergeSort";

	}

}
