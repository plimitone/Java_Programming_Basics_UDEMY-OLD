
public class AccessModifiers {
	
	// private is the most descriptive
	// default
	// protected
	// public
	
	private int x;
	public int y;
	
	public static void main(String[] args) {
		
	}
	
	// public visibility means that this method can be accessed anywhere in the program as long as there's an instance of this class
	public void doSomethingPublic() {
		
	}
	
	// this method is NOT visible outside of this class, not accessible outside this class
	private void doSomethingPrivate() {
		
	}
	
	// this method can only be accessed inside of this package and from subclasses of this class
	protected void doSomethingProtected() {
		
	}
	
	// default visibility is that this method can only be accessed inside of this package
	void doSomething() {
		
	}
}
