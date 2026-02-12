package entretien;

import java.util.Comparator;

public class Person {
	
	public static class PersonComparator implements Comparator<Person> {
		
		public static PersonComparator INSTANCE = new PersonComparator();

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	
	public int age;
	public String name;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}
