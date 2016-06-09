package algorithms.codility;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public int fibonacciRecursion(int a) {

		if (a < 1) {
			return 0;
		} else if (a == 1) {
			return 1;
		}
		return  fibonacciRecursion(a - 2) + fibonacciRecursion(a - 1);
		
	}

	public int fibonacciIteration(int a) {
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		}
		int firstNumber = 0;
		int secondNumber = 1;
		int result = 0;

		for (int i = 2; i <= a; i++) {
			result = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = result;
		}

		return result;
	}

	public List<Integer> createFibonacciList(int a) {
		List<Integer> list = new ArrayList<Integer>(a);
		list.add(0);
		list.add(1);
		for (int i = 2; i <= a; i++) {
			list.add(list.get(i - 2) + list.get(i - 1));
		}
		printFibonacciList(list);
		return list;
	}

	private void printFibonacciList(List<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Fibonacci number [" + i + "] = " + l.get(i));
		}
	}

}
