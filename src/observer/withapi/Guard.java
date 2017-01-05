package observer.withapi;

import java.util.Observable;

public class Guard extends Observable{

	public void action(String text) {
		System.out.println("===============" + text + "===============");
		setChanged();
		notifyObservers(text);
	}
}
