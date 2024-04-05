package ClassandObject;

public class ThisConstructor {
	String str;
	int n;

	public ThisConstructor() {
		this("Hello User!!!");// calling string parameterized constructor
	}

	public ThisConstructor(String str) {
		this(10);
		this.str = str;

	}

	public ThisConstructor(int n) {
		this.n = n;
	}

	public void print() {
		System.out.println(n + "" + str);
	}

	public static void main(String[] args) {
		ThisConstructor cc = new ThisConstructor();
		cc.print();
	}

}
