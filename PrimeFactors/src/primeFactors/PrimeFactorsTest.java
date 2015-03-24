package primeFactors;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}

	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}

}
