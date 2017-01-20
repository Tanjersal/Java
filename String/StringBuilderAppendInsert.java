
public class StringBuilderAppendInsert 
{

	public static void main(String[] args) 
	{
		char [] array = {'f', 'a', 'b', 'i', 'e', 'n'};
		String str = "2017!";
		boolean booleanValue = true;
		char characterValue = 'z';
		int integerValue = 7;
		long logValue = 10000000000L; //L indicates long
		float floatValue = 2.5f;// f indicates float
		double doubleValue = 33.33;
		Object objectReference = "Hello"; //assign string to object reference
		StringBuilder bufferToBeAppend = new StringBuilder("Software architecture");
		
		
		//create a buffer with stringBuilder
		
		StringBuilder stringBuilder = new StringBuilder();
		
		//call append method - chaining
		
		stringBuilder.append(objectReference).append(str).append(array).append(booleanValue).append(characterValue).append(integerValue).
		append(doubleValue).append(logValue).append(floatValue).append(bufferToBeAppend);
		
		System.out.print("Append method used");
		
		//print the string representatin
		System.out.printf("Buffer contains: %n%s%n%n", stringBuilder.toString());
		
		System.out.print("Insert method used");
		
		StringBuilder stringBuilder2 = new StringBuilder();
		
		stringBuilder2.insert(0,objectReference).insert(1,array).insert(2, booleanValue).insert(3, characterValue).insert(4,integerValue).
		insert(5, doubleValue).insert(5,logValue).insert(6,floatValue).insert(7,bufferToBeAppend);
		
		System.out.printf("Buffer2 contains: %n%s", stringBuilder2.toString() );
		
		
		

	}

}
