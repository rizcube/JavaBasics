// create static method called name_of_dog, bark
// create non static method


public class staticMethod {

	public static void main(String args[]) {
		name_of_dog("Peep");
		bark();
		sleep();
	}
	
	public static void name_of_dog(String name) {
		System.out.println(String.format("My name is: %s", name));
	}
	
	public static void bark() {
		System.out.println("I am barking");
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
	}
	
}
