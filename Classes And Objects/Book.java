//class enum book using enumeration

public enum Book 
{
	//declare constants of enum type
	JHTP("Java Programming", "2001"),
	CHTP("C Programming", "09"),
	VBHTP("Visual Programming", "484"),
	CSHTP("Csharp Programmin", "2016");
	
	
	//instance fields
	private final String title;
	private final String copyrightYear;
	
	//enum constructor
	Book(String bookTitle, String year) 
	{
		title = bookTitle;
		copyrightYear = year;
	}
	
	//getters for enum
	public String getTitle()
	{
		return title;
	}
	
	public String getCopyRight()
	{
		return copyrightYear;
	}
	
}
