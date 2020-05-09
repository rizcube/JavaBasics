
public class StringMethod {
	public static void main(String args[]) {
		
		System.out.println(greet("A"));
		System.out.println(greet("B"));
		System.out.println(greet("C"));
		System.out.println(greet("D"));
	}
	
	public static String greet(String name) {
		return String.format("Hello %s Welcome to Java", name);
	}
	
	
	
}
