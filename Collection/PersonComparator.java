package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeCompartor implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if (p1.age == p2.age) {
			return 0;
		}
		if (p1.age > p2.age) {
			return 1;
		} else {
			return -1;
		}

	}
}

class nameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
	}

}

public class PersonComparator {
	void ComparatorDemo() {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person(101, "Pradnya", 47));
		al.add(new Person(102, "sakshi", 21));
		al.add(new Person(101, "Shubhangi", 45));

		System.out.println("Sorting by Age:");
		Collections.sort(al, (new AgeCompartor()));
		for (Person pr : al) {
			System.out.println(pr.id + " " + pr.name + " " + pr.age);
		}
		System.out.println("-------------------");

		System.out.println("Sorting  by name:");
		Collections.sort(al, new nameComparator());
		for (Person pr : al) {
			System.out.println(pr.id + " " + pr.name + " " + pr.age);
		}
		System.out.println("-------------------");

	}

	public static void main(String[] args) {
		PersonComparator per = new PersonComparator();
		per.ComparatorDemo();
	}

}
