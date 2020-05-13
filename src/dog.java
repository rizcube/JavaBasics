// Java classes basics
public class dog {
	
	public static void main(String args[]) {
		name_of_dog("Peep");
		bark(); eat(); drink(); sleep(); play();
		name_of_dog("Chirp");
		bark(); eat(); drink(); sleep(); play();
	}

	public static void name_of_dog(String name) {
		System.out.println(String.format("My Name is: %s", name));
	}
	
	public static void bark() {
		System.out.println("I am barking");
	}
	
	public static void eat() {
		System.out.println("I am eating");
	}
	
	public static void drink() {
		System.out.println("I am drinking");
	}
	
	public static void play() {
		System.out.println("I am playing");
	}
	
	public static void sleep() {
		System.out.println("I am sleeping");
	}	
}
