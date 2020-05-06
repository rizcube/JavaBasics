public class forLoopInArray {
	// defining an array of double data type number
	// print all the numbers using for loop
	public static void main(String args[]) {
		double[] numList = {11.1, 220.1,33.1,44.1};
		for (int i=0; i< numList.length; i++) {
		System.out.println(numList[i]);
		}			
		// add all the numbers given in the array (numList given above)
		double sum = 0; // Initialize double datatype sum variable to be 0
		for (int i = 0; i< numList.length; i++) {
			sum = numList[i] + sum;		
		}
		System.out.println("Sum is " + sum);

		// find the largest value in the array.
		double max = numList[0]; //Initializing the first element to be the largest value
		
		for (int i = 0; i < numList.length; i++) 
		{
			if (numList[i] > max ) 
			{
				max = numList[i];
			}
		}
		System.out.println("The maximum value is "+max);
	}
}
