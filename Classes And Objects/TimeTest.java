// Driver Program

public class TimeTest 
{

	public static void main(String[] args) 
	{
		// create Time object
		Time time = new Time();
		
		//output time
		System.out.print("Initial Univ time is: ");
		System.out.println(time.toUniversalString());
		
		System.out.print("Initial std time is: ");
		System.out.println(time.toString());
		
		//set time
		time.setTime(17, 40, 19);

		System.out.print("Initial Univ time is: ");
		System.out.println(time.toUniversalString());
		
		System.out.print("Initial std time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		//attemp to set tume with invalid values
		
		try 
		{
			time.setTime(99, 99, 99);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.printf("Exeption: %s\n\n", e.getMessage());
		}
		
		//display time after attempt to set invalid values
		
		System.out.print("Initial Univ time is: ");
		System.out.println(time.toUniversalString());
		
		System.out.print("Initial std time is: ");
		System.out.println(time.toString());
		System.out.println();
		
	
	}

}
