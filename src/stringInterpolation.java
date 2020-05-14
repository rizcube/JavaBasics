
public class stringInterpolation {
	public static void main(String args[]) {
		String custName = "Rizwan";
		String streetName = "1 Fairy world";
		int age = 41;
		String city = "Heavens";
		String state = "Outer space";
		int zipcode = 786;
		String country = "Heaven";
		double grade = 4.0;
		
		System.out.println(String.format("My name is %s", custName));
		
		String custDetails = "Customer details %s, StreetName: %s, Grade %f ,Age: %d, City: %s, State: %s, Zipcode: %d, Country: %s";
		System.out.println(String.format(custDetails, custName, streetName,grade, age, city, state, zipcode, country));
		
		/*
		String template = "%s is from %s and is %s years old.";
		System.out.println(String.format(template, custName, country, age));
		 */
	}
	
}
