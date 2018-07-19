import java.util.Scanner;

public class characterArrayList
{

	public static void main(String[] args) 
	{
		char [] chars = createArray();
		
		System.out.println("The lowercase letters are: " );
		displayArray(chars);
		
		int[] counts = countLetters(chars);
		
		System.out.println();
		System.out.println("The occurences of each letter are: ");
		displayCounts(counts);
	}

	private static void displayArray(char[] chars) 
	{
		for(int i = 0; i < chars.length; i++)
		{
			if ((i + 1 ) % 20 == 0 )
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
		
	}

	public static char[] createArray()
	{
		char [] chars = new char[100];
		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		
		
		return chars;
		
		
	}
	
	
	public static int[] countLetters(char[] chars)
	{
		int[] counts = new int[26];
		
		for (int i = 0; i < chars.length; i++)
		{
			counts[chars[i] - 'a']++;
		}
		return counts;
	}
	
	
	
	public static void displayCounts(int[] counts)
	{
		for (int i = 0; i < counts.length; i++)
		{
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
	}
	
	
	
	
	public static class RandomCharacter
	{
		public static char getRandomCharacter(char ch1, char ch2)
		{
			return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
		}
		
		
		public static char getRandomLowerCaseLetter() 
		{
			return getRandomCharacter('a', 'z');
		}	
		
	}
}
