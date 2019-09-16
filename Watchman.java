
import java.util.ArrayList;

public class Watchman implements Subject {
	
	private ArrayList<Observer> observers;
	private int warninglevel;

	public Watchman(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(warninglevel);
		}

	}
	public void issueWarning(int warning) {
		warninglevel = warning;
		if(warninglevel == 1) { System.out.println("WARNING: 1 Trumpet was played!");}
		else { System.out.println("WARNING: " + warninglevel + " Trumpets were played!");}
		notifyObservers();
	}
}
