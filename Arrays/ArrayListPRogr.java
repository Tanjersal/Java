import java.util.ArrayList;

//arraylist using collections

public class ArrayListPRogr
{

	public static void main(String[] args) 
	{
		//creates arrayList of 10 string object of capacity
		ArrayList<String> items = new ArrayList<>();
		
		//added an item at the end of ArrayList
		items.add("Fabien");
		items.add(0, "Arnaud"); //insert arnaud at 0
		
		System.out.print("Display list using loop: ");
		
		//display  
		for(int i=0; i<items.size(); i++)
		{
			System.out.printf(" %s ",items.get(i));
		}
		
		//display using foreach methods
		display(items,"\n\nDisplay list contents with enhanced for loop: ");
		

		items.add("Nadia");
		items.add("Jerome");
		
		display(items, "\nList with two new elements: ");
		
		//remove the first Fabien
		items.remove("Fabien");
		display(items, "\nRemove first element Fabien: ");
		
		//check if fabien is in list
		System.out.printf("\n\"Fabien\" is %s in the list\n", items.contains("Fabien") ? "" : "not anymore ");
		
		//display number of elements in the list
		System.out.printf("\nSize and Number of element in arrayList: %s\n", items.size());
		
	}
	
	//display function
	public static void display(ArrayList<String> items, String message)
	{
		System.out.print(message);
		
		for (String item : items) 
		{
			System.out.printf(" %s ", item);
		}
		
		System.out.println();
	}

}
