package random.number;

/**
 * RandomNumberManipulation: create an array with random numbers using Random()
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */

		int maxNumber = 50;
		int [] randomArray = new int[maxNumber];
		
		System.out.println("The original random number's array: ");
		for ( int i = 0; i < maxNumber; i++ ) {
			randomArray[i] = (int) ( Math.random() * 500 + 1 );
			System.out.format("%3d ", randomArray[i]);
			
			// print 10 elements per line
			if ( (i + 1) % 10 == 0 )
				System.out.println();
		}
		System.out.println();
		
		int cntElem = 0;
		// print only even numbers in this array
		System.out.println("The even numbers in this array: ");
		for ( int i = 0; i < maxNumber; i++ ) {
			if ( randomArray[i] % 2 == 0 ) {
				System.out.format("%3d ", randomArray[i]);
				cntElem++;
			}
			
			// print 10 elements per line
			if ( cntElem == 10 ) {
				System.out.println();
				cntElem = 0;
			}
		}
	}
}

/**
 * Result: (only a sample, it is different every time )

The original random number's array: 
 86  88 355 405 366 284 367 235 107 349 
 66 420 345 319 473 336 418 119 129 241 
116 226 122 374   6 421 440  66 484 283 
197  65 207 439 334  45 102  21  82 476 
141 253 408 462  52 223 277  29  16  25 

The even numbers in this array: 
 86  88 366 284  66 420 336 418 116 226 
122 374   6 440  66 484 334 102  82 476 
408 462  52  16 

 */