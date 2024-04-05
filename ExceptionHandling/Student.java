package ExceptionHandling;

public class Student {
	static void findRollNumber(int rollNumber) throws StudentNotFoundException{
		if(rollNumber>=1 && rollNumber<=20)
			System.out.println("Student Found");
		else
			throw new StudentNotFoundException("Student not found: "+rollNumber);

}
	public static void main(String[] args) {
		try {
			findRollNumber(25);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code....");
	}
}