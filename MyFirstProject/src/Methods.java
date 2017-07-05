
public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		sayHelloTo("Charlie");
		sayHelloTo("John");
		
		// call the return 5 method
		int x = returnFive();
		System.out.println(x);
	
		//f(x) = x * x
		int result = square(5);
		System.out.println(square(returnFive()));
		
	}
	
	// this method returns a value and takes in data
	static int square (int x) {
		return x * x;
	}
	
	// this method returns int type of value 5
	static int returnFive() {
		return 5;
	}
	
	// this method will say hello to whatever name is passed to it when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
	// this method says "Hello World"
	static void sayHelloWorld() {
		System.out.println("Hello World");
	}
}
