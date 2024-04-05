package String;

public class RemoveEx {
	public static void main(String[] args) {
		String str="I am a Student";
		System.out.println(charRemoveAt(str,7));
		}

	private static String charRemoveAt(String str, int i) {
		// TODO Auto-generated method stub
		return str.substring(0,i)+str.substring(i+1);
	}

}
