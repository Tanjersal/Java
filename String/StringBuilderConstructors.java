//StringBuilder class - used for dynamic strings, modifiable string
//Should be used instead if lot of string manipulation is involved
//Used stringBuffer when multithreading as it is thread safe

public class StringBuilderConstructors 
{

	public static void main(String[] args) 
	{
		//empty constructor - with 16 characters default length
		StringBuilder stringBuilder1 = new StringBuilder();
		
		//lenght of Bonjour les amis + default 16
		StringBuilder stringBuilder2 = new StringBuilder("Bonjour les amis");
		
		// create with capacity 10
		StringBuilder stringBuilder3 = new StringBuilder(10);
		
		System.out.printf("StringBuilder1  = \"%s\"%n", stringBuilder1);
		System.out.printf("StringBuilder2 = \"%s\"%n", stringBuilder2);
		System.out.printf("StringBuilder3 = \"%s\" with capacity of %d and length of %d%n", stringBuilder3, stringBuilder3.capacity(), stringBuilder3.length());
		

	}

}
