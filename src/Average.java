
public class Average {

	public static void main(String[] args) 
	{
		//Variables declared for the array, 
		int[] numbers = new int[100];
		int number = 1;
		double sum = 0;
		double average;
		int numsAboveAverage = 0;
		
		//This loops through all 100 numbers and adds them to the sum
		for(int x = 0; x < 100; x++)
		{
			numbers[x] = number++;
			sum += numbers[x];
		}
		
		
		average = sum / 100;
		
		//This determines if the number is above the average
		for(int x = 0; x < 100; x++)
		{
			if(numbers[x] > average)
				numsAboveAverage++;
		}
		System.out.println("The average of every number from 0 to 100 is " + average + " and the amount of numbers above the average is " + numsAboveAverage);

	}

}
