//charAt - used to locate a char at a specified pos
//setCharAt - set a char to a specified position
//getChars - copy a string into a char array
//reverse - reverses the sequence of string

public class StringBuilderChars 
{

	public static void main(String[] args) 
	{
		StringBuilder builder = new StringBuilder("Hello 2017!");
		
		//return the string representation
		System.out.printf("Builder converted = %s%n", builder.toString());
		
		System.out.printf("Character at position 0 = %s%nCharacter at position 9 = %s%n", builder.charAt(0), builder.charAt(9));
		
		//convert stringbuilder to an array of char
		char []ArrayChar = new char[builder.length()];
		
		//src beg, src, dest, destSrc
		builder.getChars(0, builder.length(), ArrayChar, 0);
		
		
		System.out.print("The characters copied in array are: ");
		for (int i = 0; i < ArrayChar.length; i++) 
		{
			System.out.print(ArrayChar[i]);
		}
		System.out.println();
		
		//set the characters based on the positions 0 and 6
		builder.setCharAt(0, 'A');
		builder.setCharAt(6, 'T');
		
		//return the string representation
		System.out.printf("Builder = %s%n",builder.toString());
		
		builder.reverse();
		System.out.printf("Builder reversed = %s%n", builder.toString());
		
		
	}

}
