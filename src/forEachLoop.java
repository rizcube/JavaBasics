
public class forEachLoop {
	public static void main (String args[]) 
	{
		String[] celebrities = {"Bruno Mars","Taylor Swift", "Max Smith", "Eminem"};
		// for each loop
		// loop on the celebrities array
		for (String name:celebrities) {
			System.out.print(name);
			System.out.print(",");
		}
		System.out.println("");
		int[] age = {22,24,33,44};
		for (int x: age) {
			System.out.print(x);
			System.out.print(",");
		}
	}
}
