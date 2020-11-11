/* Thurday, September 12, 2019
implements the sieve of Eratosthenes using two linkedlists
and does so relatively efficiently using an iterator to remove 
the prime multiples.
try java sieveOfEratosthenes "interger(i.e. prime up to)"
Potential improvements: algo stops once front is greater the sqrt(max)
*/

import java.util.*;

public class sieveOfEratosthenes {
	public static void main(String[] args) {
		//Gets the max parameter from the command line
		String maxS = args[0];
		int max;
		try {
   			max = Integer.parseInt(maxS);
		} catch (NumberFormatException e) {
   			max = 10;
		}

		System.out.println("primes up to " + max);
		//Creates the list used to store the primes that will be computed by sieve()
		List<Integer> primes = sieve(max);
		System.out.println(primes);
	}

	//Returns a list of primes up to max
	//use the sieve of Eratosthenes algorithm
	public static List<Integer> sieve(int max) {
		//List for the primes
		List<Integer> primes = new LinkedList<Integer>();
		primes.add(2);
		//List of integer to sieve through, populates it
		List<Integer> numbers = new LinkedList<Integer>();
		for(int i=3;i<=max;i+=2) {
			numbers.add(i);
		}

		//Does the actual sieving
		while(!numbers.isEmpty()) {
			//the front of numbers is guaranteed to be prime
			//so remove it and use it to sieve
			int front = numbers.remove(0);	//efficient because it is the front of the list
			primes.add(front);				//Make sure we keep the prime

			//remove all multiples of the prime "front" from the list numbers
			//uses a iterator to be more efficient
			Iterator<Integer> itr = numbers.iterator();
			while(itr.hasNext()) {
				int current = itr.next();
				if(current % front == 0) itr.remove();
			}
		}
		
		return primes;
	}

}
