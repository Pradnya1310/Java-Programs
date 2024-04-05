package ClassandObject;

public class ArthmaticMethodEx {
	int addition;
	int substraction;
	int multiplication;
	int division;
	
	public static int addition(int num2,int num4) {
		return num2+num4;
	}
		
	public static int substraction(int num2,int num4) {
		return num2-num4;
	}
				
	public static int multiplication(int num2,int num4) {
	    return num2*num4;
			
	}
	public static int division(int num2,int num4) {
		return num2/num4;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		System.out.println("Addition: "+ addition(a,b));
		System.out.println("Substraction: "+ substraction(a,b));
		System.out.println("Multiplication:"+ multiplication(a,b));
		System.out.println("Division:"+ division(a,b));
		
		
		
	}
	

}
