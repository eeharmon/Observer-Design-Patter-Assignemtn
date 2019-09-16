/**
 * 
 */

/**
 * @author Duncan Harmon
 *
 */
public class Knight implements Observer {
	private Subject watchman;
	private int warninglevel;
	
	public Knight(Subject watchman) {
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
		if(warninglevel == 1) {System.out.println("Knight: Helps everyone get home safe");}
		else if(warninglevel == 2) {System.out.println("Knight: Prepares for battle");}
		else {System.out.println("Knight: does nothing");}
	}

}
