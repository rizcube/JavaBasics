
public class Customer {
	// this is constructor method
	public Customer() {
		System.out.println("Welcome to Walmart");
	}
	// Instrance method to get customer name
	public void getName(String param) {
		System.out.println("Customer name is: " + param);
	}


	public static void main(String args[]) {
		Customer object1 = new Customer();
		object1.getName("Test");
	}


}
