package tests;

import people.Person;
import utils.time.Date;

public class PeopleTest {

	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person("Marco", "Bianchi", new Date(01,01,2014));
		persons[1] = new Person("Carlo", "Magno", new Date(01,01,2014));
		persons[2] = new Person("Eric", "Hoffman", new Date(01,01,2014));
		persons[3] = new Person("Mario", "Micidial", new Date(01,01,2014));
		persons[4] = new Person("Bruno", "Liegi Baston Liegi", new Date(01,01,2014));
		
		//persons[0].order(persons);
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getName()+" "+persons[i].getSurname());
		}
	}
	
	
}
