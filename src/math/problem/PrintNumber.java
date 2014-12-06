package math.problem;

/**
 * Math Problem: Print Number
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		
		/* use a for loop to print 1 to 100 and then store into an array.
		 *then use another for loop to print only odd numbers.Then add the 
		 *total numbers from the array.
		 */
		int length = 100;
		
		int [] array = new int[length];
		
		// print a number and store it into the array
		System.out.println("First array:");
		for ( int i = 0; i < length; i++ ) {
			System.out.format( "%3d ", i + 1 );
			array[i] = i + 1;
			
			// print 10 elements per line
			if ( ( i + 1 ) % 10 == 0 )
				System.out.println();
		}
		System.out.println();
		
		int sum = 0;
		// print odd elements of above array, the same time, calculate the sum
		System.out.println("The odd elements in this array:");
		for ( int i = 0; i < length; i++ ) {
			
			// calculate the sum
			sum += array[i];
			
			// if this element is odd, print it
			if ( array[i] % 2 != 0 )
				System.out.format("%3d ", array[i] );
			
			// print 10 elements per line
			if (( i + 1 ) % 20 == 0 )
				System.out.println();
		}
		System.out.println();
		
		System.out.println("Sum of full array is: " + sum + ".");
	}

}

/**
 * Result:
 * 

First array:
  1   2   3   4   5   6   7   8   9  10 
 11  12  13  14  15  16  17  18  19  20 
 21  22  23  24  25  26  27  28  29  30 
 31  32  33  34  35  36  37  38  39  40 
 41  42  43  44  45  46  47  48  49  50 
 51  52  53  54  55  56  57  58  59  60 
 61  62  63  64  65  66  67  68  69  70 
 71  72  73  74  75  76  77  78  79  80 
 81  82  83  84  85  86  87  88  89  90 
 91  92  93  94  95  96  97  98  99 100 

The odd elements in this array:
  1   3   5   7   9  11  13  15  17  19 
 21  23  25  27  29  31  33  35  37  39 
 41  43  45  47  49  51  53  55  57  59 
 61  63  65  67  69  71  73  75  77  79 
 81  83  85  87  89  91  93  95  97  99 

Sum of full array is: 5050.

 */
