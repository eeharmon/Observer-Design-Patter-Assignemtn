/**
 * 
 */

/**
 * @author Duncan Harmon
 *
 */
public class ShopOwner implements Observer {
	private Subject watchman;
	private int warninglevel;
	
	public ShopOwner(Subject watchman) {
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
		if(warninglevel == 1) {System.out.println("Shop Owner: Close down shop and head home");}
		else if(warninglevel == 2) {System.out.println("Shop Owner: Drops everything and finds nearest hideout");}
		else {System.out.println("Shop Owner: does nothing");}
	}

}
