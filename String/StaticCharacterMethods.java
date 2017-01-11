import java.util.Scanner;

//character static methods for testing characters and converting case

public class StaticCharacterMethods 
{

	public static void main(String[] args) 
	{
		//create a scanner for user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Character: ");
		
		//read input
		String input = scanner.next();
		char ch = input.charAt(0); //returns the character from the input string
		
		//display character info
		System.out.printf("Character is defined: %b%n", Character.isDefined(ch)); //determines if character is defined in unicode
		System.out.printf("Characte is digit: %b%n", Character.isDigit(ch));
		System.out.printf("Characte is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart((ch)));
		System.out.printf("Characte is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(ch));
		System.out.printf("Characte is a letter: %b%n", Character.isLetter(ch));
		System.out.printf("Characte is a letter or a digit: %b%n", Character.isLetterOrDigit(ch));
		System.out.printf("Characte is lowerCase: %b%n", Character.isLowerCase(ch));
		System.out.printf("Characte is upperCase: %b%n", Character.isUpperCase(ch));
		System.out.printf("Characte toLower: %s%n", Character.toLowerCase(ch));
		System.out.printf("Characte toUpper: %s%n", Character.toUpperCase(ch));
		
	}

}
