package primeFactors;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsTest {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	@Test
	public void testTwo() throws Exception {
		assertEquals(list(), PrimeFactors.generate(1));
	}


}
