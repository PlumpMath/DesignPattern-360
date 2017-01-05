package observer.withapi;

import java.util.Observable;
import java.util.Observer;

public class SouthArmy implements Observer{
	
	private String rank;
	
	public SouthArmy (String rank) {
		this.rank = rank;
	}
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Guard) {
			System.out.println(rank + "가 놀람");
		}
	}
	public String getRank() {
		return rank;
	}
}
