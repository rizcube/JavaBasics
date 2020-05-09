
public class booleanMethod {

	public static void main(String args[]) 
	{
		System.out.println(isEven(44));
		System.out.println(isEven(23));
		System.out.println(isEven(34));
		System.out.println(isEven(31));
	}
	
	public static Boolean isEven(int number) {
		
		if (number % 2 ==0) 
		{
		return true;
		}
		return false;
	}
	
}
