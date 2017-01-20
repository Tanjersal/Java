//equals - test any 2 object for equality - strings contained in 2 objects are identical

// == - When 2 primitives types are compared the result is true if both are identical, when used with objects the result is
// true if both object refer to the same object in memory.

//equalsIgnoreCase - compares strings without considering if they are uppercase or lowercase

//compareTo - uses lexicographical comparison - returns 0 if equals, negative if s1<s2, positivs if s1>s2

//regionMatches - compares portion of a string 

public class StringComparison 
{

	public static void main(String[] args) 
	{
		String s1 = new String("hello"); //s1 is a copy of hello
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "Happy birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
		
		//test for equality with equals
		
		if (s1.equals("hello")) //which is true 
		{
			System.out.println("s1 equals \"hello\"");
		}
		else
		{
			System.out.println("\ns1 does not equal to \"hello\"");
		}
		
		//test for equality with =
		if (s1 == "Hello") //false they are not the same object
		{
			System.out.println("s1 is the same object as \"hello\"");
		}
		else 
		{
			System.out.println("s1 is not the same object as \"hello\"");
		}
		
		//test for equality using equalsIgnoreCase
		if (s3.equalsIgnoreCase(s4)) // true
		{
			System.out.printf("%n%s is equals %s with case ignored%n", s3, s4);
		}
		else
		{
			System.out.printf("%n%s is not equals %s with case ignored%n", s3, s4);
		}
		
		//test compareTo
		
		System.out.println("compareTo returns 0 if strings are equal, <0 if left < right, or >0 if left > right - lexicographical(numeric values)");
		System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2)); //1
		System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1)); // -1
		System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1)); // 0
		System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4)); // -32
		System.out.printf("%ns4.compareTo(s3) is %d", s4.compareTo(s3)); //32
		
		//test RegionMatches(case sensitive)
		//starting at 0, comparing s4, starting at 0, matching 5 characters
		if (s3.regionMatches(0, s4, 0, 5))
		{
			System.out.println("\nFirst 5 characters of s3 and s4 matches");
		}
		else
		{
			System.out.println("\nFirst 5 characters of s3 and s4 do not match");
		}
		
		//test RegionMatches(ignoreCase)
		//ignore case with true, starting at 0, comparing s4, starting at 0, matching 5 characters
		if (s3.regionMatches(true, 0, s4, 0, 5))
		{
			System.out.println("First 5 characters of s3 and s4 matches with case ignored");
		}
		else
		{
			System.out.println("First 5 characters of s3 and s4 do not match with case ignored");
		}
		
	}

}
