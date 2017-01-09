import java.util.Arrays;

//manipulate arrays using static func

public class ArrayManipulationsFnc
{

	public static void main(String[] args) 
	{
		//array of double
		double [] arr = {9.0,1.2,3.4,5.6,7.4};
		
		
		System.out.printf("Array before sort: ");
		for (double d : arr) 
		{
			System.out.println(d);
		}
		
		//sort the arrays
		Arrays.sort(arr);
		System.out.printf("Array sorted :", arr);
		for (double d : arr) 
		{
			System.out.println(d);
		}
		
		//fill 10 elements array with 7
		int [] filledArray = new int[10];
		Arrays.fill(filledArray, 7);
		display(filledArray, "FilledIntArray\n");
		
		//copy arrays
		int [] array = {1,2,3,4,5,6};
		int [] intArraycopy = new int [array.length];
		System.arraycopy(array, 0, intArraycopy, 0, array.length);
		display(array, "Original Arr ");
		display(intArraycopy, "intArrayCopy ");
		
		//compare array and intArraycoy fo equality
		boolean d = Arrays.equals(array, intArraycopy);
		System.out.printf("\n\norig array %s intarraycopy\n", (d ? "==" : "!="));
		
		//search array for the value 5
		int location = Arrays.binarySearch(array, 5);
		
		if (location >=0)
		{
			System.out.printf("Found 5 at element %d in array\n", location);
		}
		else
		{
			System.out.println("5 not found in array");
		}

	}
	
	public static void display(int [] arr, String description)
	{
		System.out.printf("\n%s", description);
		
		for (int value : arr) 
		{
			System.out.printf("%d", value);
		}
	}

}
