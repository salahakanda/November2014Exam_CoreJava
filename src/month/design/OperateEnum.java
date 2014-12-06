package month.design;

/**
 * OperateEnum: A kinds of operation about Month enum
 * @author Zaidong Yidayeti
 * @since December 4, 2014
 */

public class OperateEnum {
	
	public Month month;
	
	public OperateEnum(Month month){
		this.month = month;
	}
	
	public OperateEnum(){
	}

	public void setMonth(Month month) {
		this.month = month;
	}
	
	public Month getMonth() {
		return this.month;
	}

	public void WhichMonth(){
		switch(month) {
			case JAN: System.out.println("It is January.");
					break;
			case FEB: System.out.println("It is February, and it has 28 days.");
					break;
			case MAR: System.out.println("It is March, spring is near.");
					break;
			case APR: System.out.println("It is April, the year begin from it in Japan.");
					break;
			case MAY: System.out.println("It is May.");
					break;
			case JUN: System.out.println("It is June.");
					break;
			case JUL: System.out.println("It is July. We love parade.");
					break;
			case AUG: System.out.println("It is August.");
					break;
			case SEP: System.out.println("It is September, school begins.");
					break;
			case OCT: System.out.println("It is October.");
					break;
			case NOV: System.out.println("It is November. Happy birthday!");
					break;
			case DEC: System.out.println("It is December. Mery Xmath!");
					break;
			default: System.out.println("No match.");
					break;
		}
	}
}
