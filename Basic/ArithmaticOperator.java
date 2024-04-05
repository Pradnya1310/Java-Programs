package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmaticOperator {

	public static void main (String args[])throws NumberFormatException,IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	int a,b,c;
	
	System.out.println("Enter addition of number");
    int add=Integer.parseInt(reader.readLine());
    System.out.println("Enter substraction of number");
    int sub=Integer.parseInt(reader.readLine());
    System.out.println("Enter multiplication of number");
    int mul=Integer.parseInt(reader.readLine());
    System.out.println("Enter division of number");
    int div=Integer.parseInt(reader.readLine());
      
    System.out.println("Addition of number:"+add);
    System.out.println("Substraction of number:"+sub);
    System.out.println("Muliplication of number:"+mul);
    System.out.println("Division of number:"+div);
    

    
    
    
    
    


    

    
    
    
  
    
    
	}
}
