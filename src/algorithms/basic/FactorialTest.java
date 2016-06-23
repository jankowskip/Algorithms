package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactorialTest {
Factorial f = new Factorial();
int result;

	@Test
	public void testFactorialRecursion() {
		result = f.dynamicFactorial(12);
		assertEquals("error in FactorialRecursion for argument 12", result ,479001600);
		result = f.dynamicFactorial(0);
		assertEquals("error in FactorialRecursion for argument 0", result ,1);
		result = f.dynamicFactorial(-10);
		assertEquals("error in FactorialRecursion for argument -10", result ,0);
		result = f.dynamicFactorial(100);
		assertEquals("error in FactorialRecursion for argument 100", result ,0);
		
	}
	
	@Test
	public void testDynamicFactorial(){
		long startTime = System.nanoTime();
		result = f.dynamicFactorial(12);
		long endTime = System.nanoTime();
		long firstCalculationTime = endTime - startTime;
		assertEquals("error in FactorialRecursion for argument 12", result ,479001600);
		result = f.dynamicFactorial(0);
		assertEquals("error in FactorialRecursion for argument 0", result ,1);
		result = f.dynamicFactorial(-10);
		assertEquals("error in FactorialRecursion for argument -10", result ,0);
		result = f.dynamicFactorial(100);
		assertEquals("error in FactorialRecursion for argument 100", result ,0);
		startTime = System.nanoTime();
		result = f.dynamicFactorial(12);
		endTime = System.nanoTime();
		long secondCalculationTime = endTime - startTime;
		if(firstCalculationTime<=secondCalculationTime){
			fail("dynamic optimization doesnt work");
		}
		
		
	}
	
	@Test
	public void testFactorialIteration(){
		result = f.factorialIteration(12);
		assertEquals("error in FactorialIteration for argument 12", result ,479001600);
		result = f.factorialIteration(0);
		assertEquals("error in FactorialIteartion for argument 0", result ,1);
		result = f.factorialIteration(-10);
		assertEquals("error in FactorialIteration for argument -10", result ,0);
		result = f.factorialIteration(100);
		assertEquals("error in FactorialIteartion for argument 100", result ,0);
	}
	
	

}
