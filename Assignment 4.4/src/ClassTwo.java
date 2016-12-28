
public class ClassTwo extends ClassOne {
	int num1, num2;

	public ClassTwo() {
		super();// Explicit call to super class constructor
		System.out.println("In ClassTwo : Default constructor");
	}

	public ClassTwo(int inum1) {
		this.num1 = num1; // Implicit call to super class constructor
		System.out.println("In ClassTwo : Parameterized constructor with 1 parameter");
	}

	public ClassTwo(int num1, int num2) {
		super("Hello", 1);
		System.out.println("In ClassTwo : Parameterized constructor with 2 parameters");
	}

}
