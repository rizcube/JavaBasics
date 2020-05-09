// Learning about Java methods

public class voidMethod {
	
	public static void main(String args[]) {
		
		greet("A");
		greet("B");
		greet("C");
		greet("D");
	}
		// Method that return empty value
		public static void greet(String name) {
			System.out.println(String.format("Hello %s", name));
		}
	
}
