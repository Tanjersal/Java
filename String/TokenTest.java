import java.util.Scanner;

public class TokenTest 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a sentence:");
		String input = scanner.nextLine();
		
		//tokenize the string using " " 
		String []tokens = input.split(" ");
		
		System.out.printf("Number of elements in the sentence is: ", tokens.length);
		
		System.out.println("\nThe tokens are: ");
		
		for (String token : tokens) 
		{
			System.out.println(token);
		}

	}

}
