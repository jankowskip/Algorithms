package algorithms.sort;

public class QuickSort implements Sort {
	private int[] array;
	private int length;

	@Override
	public void sort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		this.array = array;
		this.length = array.length;
		quickSort(0, length - 1);
	}

	private int partition(int left, int right) {
		int temp;
		int pivot = array[(left + right) / 2];

		while (left <= right) {
			while (array[left] < pivot)
				left++;
			while (array[right] > pivot)
				right--;
			if (left <= right) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}

	private void quickSort(int left, int right) {
		int index = partition(left, right);
		if (left < index - 1)
			quickSort(left, index - 1);
		if (index < right)
			quickSort(index, right);
	}

	public String toString() {
		return "QuickSort";
	}

}
