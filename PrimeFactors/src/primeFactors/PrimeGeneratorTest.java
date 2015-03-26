package primeFactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeGeneratorTest {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeGenerator.generate(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(1), PrimeGenerator.generate(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(1,2), PrimeGenerator.generate(3));
	}
	
	@Test
	public void testFive() {
		assertEquals(list(1,2,3), PrimeGenerator.generate(5));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(1,2,3,5,7), PrimeGenerator.generate(8));
	}
	
	@Test
	public void testThirteen() {
		assertEquals(list(1,2,3,5,7,11), PrimeGenerator.generate(13));
	}
}
