package observer.withapi;

public class mainApp {

	public static void main(String[] args) {

		Guard guard = new Guard();
		 
		SouthArmy army1 = new SouthArmy("김병장");
		SouthArmy army2 = new SouthArmy("송상사");
		SouthArmy army3 = new SouthArmy("유대위");
		
		NorthArmy spyArmy = new NorthArmy("리해진 동무", army1);
		
		guard.addObserver(army1);
		guard.addObserver(army2);
		guard.addObserver(army3);
		guard.addObserver(spyArmy);
		
		guard.action("침입자 발생!!!");
		
	}

}
