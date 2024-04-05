package java8features;
import java.util.ArrayList;


public class ForEachMethodEx {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> list=new ArrayList<>();
			list.add("Pune");
			list.add("Mumbai");
			list.add("Dehli");
			list.add("Banglore");
			list.add("Chennai");
			
			list.forEach(str -> System.out.println(str));
			
	}

}



