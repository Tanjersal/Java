import java.util.Scanner;

//digit - convert characters to digits
//forDigits - convert digits to characters

public class StaticCharacterMethods2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Program converts charater using the radix.");
		
		System.out.println("Please choose the conversion displayed");
		
		System.out.printf("%n1--%s%n2--%s", "Convert a digit to a character", "Convert a character to a digit");
		
		System.out.println("\nChoice: ");
		int choice = scanner.nextInt();
		
		System.out.println("Please enter a radix: 2, 8, 10 or 16");
		
		int radix = scanner.nextInt();
		
		//process request
		switch (choice) 
		{
		case 1:
			System.out.println("Enter a digit: ");
			int digit = scanner.nextInt();
			//conversion
			System.out.printf("The conversion is: %s%n", Character.forDigit(digit, radix));
			break;

		case 2:
			System.out.println("Enter a character: ");
			char ch = scanner.next().charAt(0); 
			//conversion
			System.out.printf("Converted character to digit is: %s%n", Character.digit(ch, radix));
			break;
		}
		
		scanner.close();
	}

}
