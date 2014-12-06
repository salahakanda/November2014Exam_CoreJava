package math.problem;

/**
 * Math Problem: Find Prime Numbers
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.Also print out the total prime numbers within the range.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/

		Boolean isPrime = true;
		
		int maxNumber = 1000;
		int count = 0;
		int cntLoop = 0;
		
		System.out.println("The prime numbers between 1 and 1000:");
		for ( int i = 2; i <= maxNumber; i++) {
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				cntLoop++;
				if (i % j == 0){
					isPrime = false;
					break;
				}
			}
			if ( isPrime ) {
				System.out.format("%4d ", i);
				count++;
				
				// print 10 prime numbers per line
				if ( count % 10 == 0 )
					System.out.println();
			}
		}
		System.out.println(System.lineSeparator());
		System.out.println("There is " + count + " prime numbers between 1 and " + maxNumber + ".");
		System.out.println("Total loop: " + cntLoop);

	}

}


/**
 * Result:

The prime numbers between 1 and 1000:
   2    3    5    7   11   13   17   19   23   29 
  31   37   41   43   47   53   59   61   67   71 
  73   79   83   89   97  101  103  107  109  113 
 127  131  137  139  149  151  157  163  167  173 
 179  181  191  193  197  199  211  223  227  229 
 233  239  241  251  257  263  269  271  277  281 
 283  293  307  311  313  317  331  337  347  349 
 353  359  367  373  379  383  389  397  401  409 
 419  421  431  433  439  443  449  457  461  463 
 467  479  487  491  499  503  509  521  523  541 
 547  557  563  569  571  577  587  593  599  601 
 607  613  617  619  631  641  643  647  653  659 
 661  673  677  683  691  701  709  719  727  733 
 739  743  751  757  761  769  773  787  797  809 
 811  821  823  827  829  839  853  857  859  863 
 877  881  883  887  907  911  919  929  937  941 
 947  953  967  971  977  983  991  997 

There is 168 prime numbers between 1 and 1000.
Total loop: 5288


*/