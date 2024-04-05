package ExceptionHandling;

public class fINALLYeX {

	public static void main(String[] args) {
		System.out.println("case: where exception dosen't occur");
		try {
			int a=10/5;
			System.out.println("Div:"+a);
		}catch (Exception e) {
		 e.printStackTrace();	
		}
		finally {
			System.out.println("case1:always executes");
		}
		System.out.println("case:where execption occurs and handles");
		try {
			int a=10/0;
			System.out.println("Div:"+a);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case2:always executes");
		}
		System.out.println("case3:where exception occurs and does not handled");
		try {
			String s=null;
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			e.printStackTrace();		
		}
		finally {
			System.out.println("case3:always executes");
		}
		System.out.println("rest of code");

}
}
