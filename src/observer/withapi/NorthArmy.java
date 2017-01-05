package observer.withapi;

import java.util.Observable;
import java.util.Observer;

public class NorthArmy implements Observer{

	private String name;
	private SouthArmy people;
	
	public NorthArmy (String name, SouthArmy people) {
		this.name = name;
		this.people = people;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Guard) {
			System.out.println("북한군 " + name + "가 간첩질한게 들통남");
			System.out.println("북한군 " + name + "가 " + people.getRank() + "을 인질로 잡음");
		}
	}

	
}
