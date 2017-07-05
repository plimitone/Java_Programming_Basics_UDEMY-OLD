
public class Conditionals {
	public static void main(String[] args) {
		
		// if (some expression that evaluates to true)
		// 			do something
		
		boolean sayHello = false;
		boolean sayHey = true;
		
		
		// only the first statement to evaluate to true gets executed
		if(sayHello) {
			System.out.println("Hello");
		} else if (sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}
		
		// can use >, <, >=, <=, !=, ==
		
		// && AND, || OR
		
		int playerX = 50; 
		
		if (true && false) {
			System.out.println("and executed");
		}
		
		// if our player is past the left side of the screen OR if our player is past the right side of the screen
		if (playerX < 0 || playerX > 800) {
			// some code that reverse's player's direction
			System.out.println("OR EXECUTED");
		}
	}
}
