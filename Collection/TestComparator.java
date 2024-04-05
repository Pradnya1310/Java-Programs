package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
		{
			return 0;

		}
		else if(s1.age>s2.age)
		{
		return 1;
	}
		else
		{
			return -1;
		}
	}
	
}
class NameComparator implements Comparator<Student1>
{
@Override
public int compare(Student1 s1, Student1 s2) {
	// TODO Auto-generated method stub
	return s1.name.compareTo(s2.name);
}
}
public class TestComparator {
	void ComparatorDemo() {
		ArrayList<Student1>al=new ArrayList<Student1>();
		al.add(new Student1(1,"Pradnya",20));
		al.add(new Student1(2,"Shraddha",24));
		al.add(new Student1(3,"Karuna",40));
		System.out.println("Sorting by Age");
		Collections.sort(al,new AgeComparator());
		for(Student1 st:al)
		{
			System.out.println(st.rollNo+" "+st.age+" "+st.age);
		}
		System.out.println("-----------------------");
		Collections.sort(al,new NameComparator());
		for(Student1 st:al)
		
		{
			System.out.println(st.rollNo+" "+st.age+" "+st.age);
		}
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		TestComparator test=new TestComparator();
		test.ComparatorDemo();
	}

}



