
public class DeckOfCards {

	public static void main(String[] args) 
	{
		//Initializes the suit, rank, number of cards in the deck, and the number of cards picked
		int deck[] = new int[52];
		int card[] = new int[4];
		String[] group = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String [] Nums = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//This for loop assigns number to each of the array's elements
		for(int c = 0; c < deck.length; c++)
		{
			deck[c] = c;
		}
		
		//This for loop randomizes and sets the card number for later
		for(int i = 0; i < card.length; i++)
		{
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
					
		}
		
		//From there, this loop determines where the card lies in terms of rank and suit
		for(int x = 0; x < card.length;x++)
		{
			String suit = group[deck[x] / 13];
			String rank = Nums[deck[x] % 13];
			
			System.out.println("Card Number: " + deck[x] + " is the " + rank + " of " + suit + ". \n");
		}

	}

}
