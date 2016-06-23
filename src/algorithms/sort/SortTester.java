package algorithms.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortTester {

	public void executeSortAndPrint(List<Sort> list, int sizeOfArray) {
		System.out.println("Array to sort");
		int[] array = genereRandomArray(sizeOfArray);
		System.out.println(Arrays.toString(array));
		for (Sort s : list) {
			int[] arrayTester = array.clone();
			System.out.println('\n' + "-----" + s.toString() + "----");
			long startTime = System.nanoTime();
			s.sort(arrayTester);
			long endTime = System.nanoTime();
			long time = endTime - startTime;
			System.out.println(Arrays.toString(arrayTester));
			String info = String.format("needed %,d ns to sort list", time);
			System.out.println(info);
		}
	}

	private int[] genereRandomArray(int size) {
		int[] randomArray = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			randomArray[i] = r.nextInt(99) + 1;
		}
		return randomArray;
	}

}
