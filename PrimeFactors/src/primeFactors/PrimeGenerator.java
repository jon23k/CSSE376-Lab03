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
		for(int x=0;x<i;x++)
		{
			if(isPrime(x))
			{
				primes.add(x);
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int i) {
		int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
  }
}
