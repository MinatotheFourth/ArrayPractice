import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		//Variable declarations and array creations
		String[] firstNames = new String [4];
		String[] lastNames = new String[4];
		String key;
		Scanner input = new Scanner(System.in);
		
		//This area asks the user to enter a string into the database
		System.out.println("Add up to four shinobi to the list");
		for(int i = 0; i < firstNames.length; i++)
		{
			System.out.print("First Name: ");
			firstNames[i] = input.nextLine();
			
			System.out.print("Last Name: ");
			lastNames[i] = input.nextLine();
			
			System.out.print("\n");
		}
		
		System.out.println("All done.\n"
				+ "Now, enter the first name in the squad with no space at the end: ");
		
		key = input.nextLine();
		Search_task(firstNames, key);
		
		//If the string is in the list
		if(Search_task(firstNames, key) != -1 && Search_task(firstNames, key) < 3)
			System.out.println("Shinobi is in the squad. Here's the list \n");
			
		//If the user is silly
		else if(key.equals(null))
			System.out.println("Impossible!");
			
		//This is for if the int isn't in the index
		else
			System.out.println("Nah, fam. Nothing. Here's the list \n");
		
		for(int x = 0; x < firstNames.length; x++)
		{
			System.out.println((x+1) + ". " + firstNames[x] + " " + lastNames[x]);
		}
	}

	//The Linear Search Method. It can be reused. That's the cool part.
		public static int Search_task(String[] name, String key )
		{
			for(int i = 0; i < name.length; i++)
				{
					if(key.contentEquals(name[i]))
						return i;
				}
			return -1;
			
		}
		

}
