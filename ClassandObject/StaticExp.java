package ClassandObject;

public class StaticExp {
	
	int rollNumber;
	String name;
	static String instituteName="Edubridge Learning";
	
	public StaticExp() {
	
	}
    public StaticExp(int rno,String nm) {
    	rollNumber = rno; //rollNumber = 101
    	name = nm; //name=Sakshi
    			
    }
    public void display() {
    	System.out.println("RollNo : "+rollNumber);
    	System.out.println("Name : "+name);
    	System.out.println("Institute Name :"+instituteName);
    	
    	
    }
    
    public static void changeName(String newInstituteName) {
    	instituteName=newInstituteName;
    	
    }
    public static void main(String[] args) {
		StaticExp.changeName("Edubridge Learning Pvt Ltd");
    	
    	StaticExp stud1=new StaticExp(101,"Sakshi");
    	stud1.display();
    	
    	StaticExp stud2=new StaticExp(102,"Suraj");
    	stud2.display();

    }
}
