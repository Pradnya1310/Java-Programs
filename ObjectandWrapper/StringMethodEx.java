package ObjectandWrapper;

public class StringMethodEx {
	public static void  main(String[] args) {
		
	String str1 = new String("Hello");
	System.out.println(str1);

	String s1 ="Welcome";
	System.out.println(s1);
	String s2 ="Hello", s3="welcome", s4="        welocome to Edubridge       ";


	System.out.println("char at 3rd position:"+s1.charAt(3));
	
	System.out.println("Length is: "+s4.length());

	System.out.println("substring(3):"+s1.substring(3));

	System.out.println("substring(1,4):"+s1.substring(1,4));

	System.out.println("sl.contains(e):"+s1.contains("e")); 
	
	System.out.println("sl.contains(x):"+s1.contains("come"));

	System.out.println("sl.equals(s3): "+s1.equals(s3));

	System.out.println("s1.equalsIgnoreCase (s3): "+s1.equalsIgnoreCase (s3));

	System.out.println("s2.isEmpty(): "+s2.isEmpty());

	System.out.println("s3.indexOf(e):"+s3.indexOf('e'));
	
	System.out.println("s3.LastIndexOf(e): "+s3.lastIndexOf('e'));
	
	System.out.println("uppercase:"+s3.toUpperCase());
	
	System.out.println("lowercase:"+s3.toLowerCase());
	
	System.out.println("s2.concat(user):"+s2.concat("User"));
	System.out.println(s2);
	s2=s2.concat("User");
	System.out.println(s2);
	
	System.out.println("length before trim(): "+s4.length());
	s4=s4.trim();
    System.out.println("length after trim(): "+s4.length());
    
    String strSplt[]=s4.split(" ");
    
    System.out.println("Splited strings: ");
	}
}
    
	
	
	
	
	
	
	
		
	

	
	

	
	
	
	
	
	
	
	
