//simple array application for frequency in array

public class StudentPoll 
{

	public static void main(String[] args) 
	{
		//students response gathered in array
		int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		
		//array of frequency counter
		int [] frequency = new int [6]; // 6 for the scale 1-5 rating
		
		// for each answer, select responses element and use that value
		// as frequency index to determine element to increment
		
		for (int answers = 0; answers < responses.length; answers++) 
		{
			try 
			{
				++frequency[responses[answers]];
				
			} catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
				System.out.printf("responses[%d] = %d\n\n", answers, responses[answers]);
			}
		}
		
		System.out.printf("%s%10s\n","Rating", "Frequency");
		
		//output each array value
		for (int i = 0; i < frequency.length; i++) 
		{
			System.out.printf("%6d%10d\n", i, frequency[i]);
		}
		
	}

}
