package Collection;

import java.util.*;

class PersonCompare implements Comparable<PersonCompare> {

	private int id;
	private String name;
	private int age;

//		  

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(PersonCompare p) {

		if (id > p.id) {
			return 1;
		} else if (id < p.id) {
			return -1;
		} else {
			return 0;
		}

	}

}

public class PersonComparable {

	void ComparablePerson() {
		List<PersonCompare> al = new ArrayList<>();
		PersonCompare p1 = new PersonCompare();
		p1.setId(110);
		p1.setName("Rajan");
		p1.setAge(25);

		PersonCompare p2 = new PersonCompare();
		p2.setId(105);
		p1.setName("Riya");
		p1.setAge(22);

		PersonCompare p3 = new PersonCompare();
		p3.setId(101);
		p3.setName("Sonam");
		p3.setAge(23);

		al.add(p1);
		al.add(p2);
		al.add(p3);

		System.out.println("****Before Sorting****");
		for (PersonCompare p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
		}
		Collections.sort(al);
		System.out.println("****After Sorting****");
		for (PersonCompare p : al) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
		}
	}

	public static void main(String[] args) {
		PersonComparable obj = new PersonComparable();
		obj.ComparablePerson();
	}
}
