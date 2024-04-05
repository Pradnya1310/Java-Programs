package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interest {
	public static void main(String args[])throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the principal aamount:");
		double principal=Double.parseDouble(reader.readLine());
		
		System.out.println("Enter the annual ineterest rate(in percentage):");
		double rate=Double.parseDouble(reader.readLine());
		
		rate/=100;
		
		System.out.println("Enter the time period(in years):");
		double time=Double.parseDouble(reader.readLine());
		double simpleInterest=(principal*rate*time);
		System.out.println("Simple Interest:"+simpleInterest);
		
		reader.close();


		
		
		
	}

}
