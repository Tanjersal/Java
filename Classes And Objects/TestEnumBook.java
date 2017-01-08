import java.util.EnumSet;

//driver

public class TestEnumBook 
{
	public static void main(String[] args) 
	{
		System.out.print("All books:\n");
		
		//print all books - book.values gets all enum constants
		for (Book book : Book.values())
		{
			System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyRight());
		}
		
		System.out.println("\nDisplay a range of enum constants:\n");
		
		//print first four books
		for (Book book : EnumSet.range(Book.JHTP, Book.VBHTP))
		{
			System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyRight());
		}
	}

}
