
public class ClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne c1 = new ClassOne();
		System.out.println("---------------------------------------------------------");
		ClassOne c2 = new ClassOne(1);
		System.out.println("---------------------------------------------------------");
		ClassOne c3 = new ClassOne("Hello", 1);
		System.out.println("---------------------------------------------------------");
		ClassOne c4 = new ClassOne(1, 2, 3);
		System.out.println("---------------------------------------------------------");
		ClassTwo c5 = new ClassTwo();
		System.out.println("---------------------------------------------------------");
		ClassTwo c6 = new ClassTwo(1);
		System.out.println("---------------------------------------------------------");
		ClassTwo c7 = new ClassTwo(1, 2);
	}

}
/*
******************************************************************************
Output:
In ClassOne : Default constructor
---------------------------------------------------------
In ClassOne : Parameterized constructor with 1 parameter
---------------------------------------------------------
In ClassOne : Parameterized constructor with 2 parameters
---------------------------------------------------------
In ClassOne : Parameterized constructor with 3 parameters
---------------------------------------------------------
In ClassOne : Default constructor
In ClassTwo : Default constructor
---------------------------------------------------------
In ClassOne : Default constructor
In ClassTwo : Parameterized constructor with 1 parameter
---------------------------------------------------------
In ClassOne : Parameterized constructor with 2 parameters
In ClassTwo : Parameterized constructor with 2 parameters

******************************************************************************
*/