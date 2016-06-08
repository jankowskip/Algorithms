package algorithms.sort;

public class ShellSort implements Sort {

	public void sort(int[] array) {
		int temp = 0;
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				temp = array[i];
				for (int j = i; j >= gap && array[j - gap] > temp; j -= gap) {
					temp = array[j];
					array[j] = array[j - gap];
					array[j - gap] = temp;
				}
			}
		}
	}

	public String toString() {
		return "ShellSort";

	}

}
