package Collection;

import java.util.ArrayList;

public class Student {
	int Rno,Age;
	String Name;
	
	public Student(int rno,int age,String name) 
	{
		Rno=rno;
		Name=name;
		Age=age;
	}

}
class StudentData{
	public static void main(String[] args) {
		Student s1=new Student(1,20,"Pradnya");
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
	}
}
