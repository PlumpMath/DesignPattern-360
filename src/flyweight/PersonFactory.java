package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

	private static Map<String, Person> map = new HashMap<String, Person>();
	  public synchronized static Person getPerson(String name) {
		  if (!map.containsKey(name)) {
			  Person tmp = new Person(name);
			  map.put(name, tmp);
		  } //없으면 만들거라!
		  return map.get(name); //만든 것 혹은 있던 것 리턴
	  }
	  
	  public static class Person {
		  private String name; //Final!!!
		  private Person(String name) {
			  this.name = name;
		  }
		  public String getName() {
			  return name;
		  }
	  }
}
