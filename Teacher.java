/**
 * 
 */

/**
 * @author Duncan Harmon
 *
 */
public class Teacher implements Observer {
	private Subject watchman;
	private int warninglevel;
	
	public Teacher(Subject watchman) {
		warninglevel = 0;
		this.watchman = watchman;
		this.watchman.registerObserver(this);
		
	}
	@Override
	public void update(int warning) {
		warninglevel = warning;
		display();
		
	}
	
	public void display() {
		if(warninglevel == 1) {System.out.println("Teacher: Helps get every kid home safe");}
		else if(warninglevel == 2) {System.out.println("Teacher: Brings all students to the underground shelter");}
		else {System.out.println("Teacher: does nothing");}
	}

}
