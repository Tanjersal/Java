//String class shows many ways of initializing String objects

public class StringConstructors 
{

	public static void main(String[] args) 
	{
		//create an array of characters
		char []salut = {'B', 'o', 'n', 'j', 'o', 'u', 'r', ' ', 'f', 'a', 'b'};
		
		
		String value = new String("Hello world");
		
		//initializing the string object with empty constructor
		String test1 = new String();
		
		//initializing the string object with an object 
		String test2 = new String(value);
		
		//initializing the string object with an array
		
		String test3 = new String(salut);
		
		//initializing the string object with an array creating the subarray 0-7
		
		String test4 = new String(salut, 0, 7);
		
		
		System.out.printf("Test1 = %s%nTest2 = %s%nTest3 = %s%nTest4 = %s%n", test1, test2, test3, test4);
	}

}
