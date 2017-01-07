package flyweight;

import flyweight.PersonFactory.Person;

public class MainApp {

	public static void main(String[] args) {
		Person p1 = PersonFactory.getPerson("송성은");
		Person p2 = PersonFactory.getPerson("개발자");
		Person p3 = PersonFactory.getPerson("송성은");
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}

}
