package people.uni.tests;

import people.People;
import people.Person;
import people.uni.Student;
import people.uni.Teacher;
import utils.time.Date;
/**
 * 
 * @author cl411531
 *
 */
public class PeopleTest {
	
	/** 
	 * @param args  lalla <h3>YEAH</h3>
	 */
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Student("Marco", "Bianchi", new Date(01,01,2014),0);
		persons[1] = new Student("Carlo", "Magno", new Date(01,01,2014),1);
		persons[2] = new Student("Eric", "Hoffman", new Date(01,01,2014),2);
		persons[3] = new Teacher("Mario", "Micidial", new Date(01,01,2014),"Analisi");
		persons[4] = new Teacher("Bruno", "Liegi Baston Liegi", new Date(01,01,2014),"FDI");
		
		
		People people=new People();
		people.setPeople(persons);
		people.order();
		
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);		//chiama il toString() dell'oggetto
		}
	}
	
	
}
