import javax.swing.JLabel;

public class ClassesAndObjects {
	public static void main(String[] args) {
		JLabel label = new JLabel();
		
		Person john = new Person("John");
		john.setAge(20);
		
		Person bob = new Person("Bob");
		bob.setAge(25);
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old.");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");
	}
}
