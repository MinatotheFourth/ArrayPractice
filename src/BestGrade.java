import java.util.Scanner;

public class BestGrade 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		//This gets the array size from the user
		System.out.println("How many grades will you be entering?");
		x = input.nextInt();
		
		//These are the only two methods that will be executed in the main
		int[] grades = enterGrades(x);
		determineGrades(grades);
	}
		
	//The method is to get the grades from the user
	public static int[] enterGrades(int g)
	{
		int[] list = new int[g];
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.println("Enter the grade for Student " + (i + 1) + ": ");
			list[i] = input.nextInt();
		}
		
		return list; 
	}
	
	//This method will determine the grades each student will get along with the highest score
	public static void determineGrades(int[] gradeList)
	{
	
		int max = 0;
		
		for(int i = 0; i < gradeList.length; i++)
		{
			if(gradeList[i] < 70)
				System.out.println("Student " + (i + 1) + " scored " + gradeList[i] + " resulting in an F.");
			
			else if(gradeList[i] >= 70 && gradeList[i] < 80)
				System.out.println("Student " + (i + 1) + " scored " + gradeList[i] + " resulting in a C.");
			
			else if(gradeList[i] >= 80 && gradeList[i] < 90)
				System.out.println("Student " + (i + 1) + " scored " + gradeList[i] + " resulting in a B.");
			
			else if(gradeList[i] >= 90)
				System.out.println("Student " + (i + 1) + " scored " + gradeList[i] + " resulting in an A.");
			
			//This part of the loop determines the highest integer in the array
			if(gradeList[i] > max)
				max = gradeList[i];
			
		}
		
		System.out.println("The highest score from these grades is " + max);
	}
}
