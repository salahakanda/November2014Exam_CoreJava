package math.problem;

/**
 * Math Problem: Array Pattern
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 
		 * 1,2,3,4,5,10,12,14,16,18,23,26,29,32,35,40,44,48,52,56,61,66,71,76,81.......n
		 * 
		 */
		int next = 1;
		int step = 1;
		int cntItem = 30;
		boolean newLine = true;
		
		System.out.println("The first 30 elements of this array are:");
		for ( int i = 1; i <= cntItem; i++ ) {
			if ( newLine ) {
				System.out.print("step = " + step + ":  ");
				newLine = false;
			}
			System.out.format( "%4d ", next );
			
			if ( i % 5 == 0 ){
				step++;
				next = next + 5;
				System.out.println();
				newLine = true;
			} else {
				next = next + step;
			}
		}
	}
}

/**
 * Result:

The first 30 elements of this array are:
step = 1:     1    2    3    4    5 
step = 2:    10   12   14   16   18 
step = 3:    23   26   29   32   35 
step = 4:    40   44   48   52   56 
step = 5:    61   66   71   76   81 
step = 6:    86   92   98  104  110 

 */