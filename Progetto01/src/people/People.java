package people;

public class People {
	
	private Person[] people;
	
	public Person[] getPeople() {
		return people;
	}

	public void setPeople(Person[] people) {
		this.people = people;
	}

	public void order(){
		
		for (int i = 0; i < people.length-1; i++) {
			for (int j = i+1; j < people.length; j++) {
				
				if (people[i].compareTo(people[j])>0) {
					Person temp = people[i];
					people[i] = people[j];
					people[j] = temp;
				}
			}
		}
	
	}
}
