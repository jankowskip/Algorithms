package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorialRecursion() {
		Factorial f = new Factorial();
		assertEquals("error in FactorialRecursion for argument 12", 479001600, f.dynamicFactorial(12));
		assertEquals("error in FactorialRecursion for argument 0", 1, f.dynamicFactorial(0));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFactorialRecursion() {
		Factorial f = new Factorial();
		f.factorialRecursion(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFactorialRecursion() {
		Factorial f = new Factorial();
		f.factorialRecursion(-10);
	}

	@Test
	public void testDynamicFactorial() {
		int result;
		Factorial f = new Factorial();
		long startTime = System.nanoTime();
		result = f.dynamicFactorial(12);
		long endTime = System.nanoTime();
		long firstCalculationTime = endTime - startTime;
		assertEquals("error in FactorialRecursion for argument 12", 479001600, result);
		assertEquals("error in FactorialRecursion for argument 0", 1, f.dynamicFactorial(0));
		startTime = System.nanoTime();
		result = f.dynamicFactorial(12);
		endTime = System.nanoTime();
		long secondCalculationTime = endTime - startTime;
		if (firstCalculationTime <= secondCalculationTime) {
			fail("dynamic optimization doesnt work");
		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFactorialDynamic() {
		Factorial f = new Factorial();
		f.dynamicFactorial(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFactorialDynamic() {
		Factorial f = new Factorial();
		f.dynamicFactorial(-10);
	}

	@Test
	public void testFactorialIteration() {
		Factorial f = new Factorial();
		assertEquals("error in FactorialIteration for argument 12", 479001600, f.factorialIteration(12));
		assertEquals("error in FactorialIteartion for argument 0", 1, f.factorialIteration(0));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFactorialIteration() {
		Factorial f = new Factorial();
		f.factorialIteration(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFactorialIteration() {
		Factorial f = new Factorial();
		f.factorialIteration(-10);
	}

}
