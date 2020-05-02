
public class orConditionalExpression {

	public static void main(String args[]) {
		
		double account_balance = 10050000.04; // try only 500000 with age greater and less then 65
		int age = 64;
		//conditional execution with OR
		if (account_balance >= 1000000 || age>=65){
			System.out.println("You can retire now..Good Luck!");
		} else {
			System.out.println("You still need to save money for retirement.");
		}
		
	}
	
}
