
public class Scope {
	
	// global variables (available to ANY method in this class)
	static int x;
	static int y;
	
	public static void main(String[] args) {
	 int x = 5;
	 System.out.println("The value of x here should be 5....Here is the output " + "[" + x + "]" );
	 
	 int y = 10000;
	 System.out.println("Global value of y is: " + y);
	 
	 doSomething();
	 
	 doSomethingLocally();
	}
	
	static void doSomething() {
		x = 10;
		System.out.println("The value of x here should be 10..doSomething() method....Here is the output " + "[" + x + "]" );
	}
	
	static void doSomethingLocally() {
		// this variable is only available to this method
		// when this method is done executing, it does not exist
		int y = 100;
		System.out.println("The value of y is: " + y);
	}
}
