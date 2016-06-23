package algorithms.basic;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	List<Integer> fibList = new ArrayList<Integer>();

	public Fibonacci(){
		fibList = new ArrayList<Integer>();
		fibList.add(0);
		fibList.add(1);
	}
	
	
	public int fibonacciRecursion(int index) {
		if (index < 1) {
			return 0;
		} else if (index == 1) {
			return 1;
		}
		return  fibonacciRecursion(index - 2) + fibonacciRecursion(index - 1);
		
	}

	public int fibonacciIteration(int index) {
		if (index < 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		}
		int firstNumber = 0;
		int secondNumber = 1;
		int result = 0;

		for (int i = 2; i <= index; i++) {
			result = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = result;
		}

		return result;
	}

	public int dynamicFibonacci(int index) {
		if(index<0){
			return 0;
		}
		try{
			fibList.get(index);
		} catch(Exception e){
			for (int i = fibList.size(); i <= index; i++) {
				fibList.add(fibList.get(i - 2) + fibList.get(i - 1));
			}
		}
		return fibList.get(index);
	}



}
