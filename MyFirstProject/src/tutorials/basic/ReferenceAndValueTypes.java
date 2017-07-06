package tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		//byte, short, int, long, float, double, boolean, char
		
		int x = 5;
		addOneToIntNumber(x);
		System.out.println(x); //we're passing the value type so we're passing a copy of the value of x which is 5
		
		Person john;
		john = new Person("John"); //we are creating a new person object and assigning John to refer to it
		john.setAge(20);
		celebrateBirthday(john);  //we passing a reference to the method so the method can use the reference on the object
		System.out.println(john.getAge());
	}
	
	private static void celebrateBirthday(Person john) {
		john.setAge(john.getAge() + 1);
		
	}

	static void addOneToIntNumber(int number) {
		number = number + 1;
	}
}
