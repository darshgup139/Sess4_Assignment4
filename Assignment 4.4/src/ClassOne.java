
public class ClassOne {
	int num1, num2, num3;
	String s;

	public ClassOne() {
		System.out.println("In ClassOne : Default constructor");
	}

	public ClassOne(int num) {
		this.num1 = num;
		System.out.println("In ClassOne : Parameterized constructor with 1 parameter");
	}

	public ClassOne(String str, int num) {
		this.s = str;
		this.num1 = num;
		System.out.println("In ClassOne : Parameterized constructor with 2 parameters");
	}

	public ClassOne(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		System.out.println("In ClassOne : Parameterized constructor with 3 parameters");
	}
}
