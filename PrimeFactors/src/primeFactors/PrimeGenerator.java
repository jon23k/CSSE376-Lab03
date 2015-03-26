package primeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeGenerator {
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes =new ArrayList<Integer>();
		if(i>1)
		{
			primes.add(1);
		}
		if(i>2)
		{
			primes.add(2);
		}
		
		return primes;

	}

}
