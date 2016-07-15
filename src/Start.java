import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.basic.Fibonacci;
import algorithms.codility.MaxCounters;
import algorithms.sort.BubbleSort;
import algorithms.sort.InsertionSort;
import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;
import algorithms.sort.SelectionSort;
import algorithms.sort.ShellSort;
import algorithms.sort.Sort;
import algorithms.sort.SortTester;

public class Start {

	public static void main(String[] args) {

		// Sorting
		System.out.println("----------Sorting----------");
		Sort bubbleSort = new BubbleSort();
		Sort insertionSort = new InsertionSort();
		Sort selectionSort = new SelectionSort();
		Sort shellSort = new ShellSort();
		Sort mergeSort = new MergeSort();
		Sort quickSort = new QuickSort();
		List<Sort> sortList = new ArrayList<Sort>();
		sortList.addAll(Arrays.asList(bubbleSort, insertionSort, selectionSort, shellSort, mergeSort, quickSort));
		SortTester sortTester = new SortTester();
		sortTester.executeSortAndPrint(sortList, 60);
		
		int N = 5;
//		int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,15,15,15,15,15,15,15,15,1,15};
		
		int[] A = {1,2,3,4,5,6,6,6,1,6};
		MaxCounters mc = new MaxCounters();
		mc.solution(N, A);
//		(1,[1,1,1,2])

	}

}
