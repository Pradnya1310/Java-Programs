package DoSelectPrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteString {
	public static boolean infString(String infStr,String toFind)
	{
	if(toFind.length()<infStr.length() && !infStr.contains(toFind)){
		return false;
		
	}
	String replaceStr=infStr;//replaceStr=ghijk
	while(replaceStr.length()<toFind.length()*3)
	{
		replaceStr+=infStr;
	}
	return replaceStr.contains(toFind);
}

  public static void main(String[]args)throws IOException{
	  BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	  String str = input.readLine();
	String words[]=str.split(" ");
      String a=words[0];//a=ghijkghi
	  String b=words[1];//b=ghijkghi
	  if(infString(a,b)) {//infStr(ghijk,ghijkhi)
		  System.out.println("YES");
	  }
	  else {
		  System.out.println("NO");
	  }
	  

}
}
