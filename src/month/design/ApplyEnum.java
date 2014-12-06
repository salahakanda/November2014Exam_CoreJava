package month.design;

/**
 * ApplyEnum: implementation of using enum type variable Month
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */

		OperateEnum opm = new OperateEnum(Month.NOV);
		System.out.println("--- Now the Month is: " + opm.getMonth() + " ---");
		opm.WhichMonth();

		System.out.println();
		
		opm.setMonth(Month.DEC);
		System.out.println("--- Now the Month is: " + opm.getMonth() + " ---");
		opm.WhichMonth();
	}
}

/**
 * Result:

--- Now the Month is: NOV ---
It is November. Happy birthday!

--- Now the Month is: DEC ---
It is December. Mery Xmath!

 */
