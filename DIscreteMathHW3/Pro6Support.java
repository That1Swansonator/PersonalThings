import java.util.Scanner;

public class Pro6Support 
{
	public void Pro6Support() 
	{
		//Warning: Null Construction Zone 
	}

	public int repeatCheck(int numHold, int stor[]) 
	{
		int safeToAdd = 0; // if numHold is unique, this var becomes 1
		
		for (int i = 0; i < stor.length; i++) 
		{
			if (numHold == stor[i]) 
				break;

			else
				safeToAdd = 1;

		}

		return safeToAdd;
	}

	public int[] fillSet(int stor[]) 
	{
		Scanner userIn = new Scanner(System.in);
		boolean complete = false; //make while loop that ends when this var is true
		int numberHold;
		int index = 0;
		int safeToAdd = 0;

		//while() starts here
		while (!complete) 
		{
			
			//Print indexes and arrays
			for (int i = 0; i < stor.length; i++) 
				System.out.print(i + "|  ");
			
			System.out.println();

			for (int i = 0; i < stor.length; i++)
				System.out.print(stor[i] + ",  ");

			//appending array
			System.out.println("enter an integer for index " + index);
			numberHold = userIn.nextInt();

			safeToAdd = repeatCheck(numberHold, stor);

			if (safeToAdd == 1) 
			{
				stor[index] = numberHold;
				System.out.println("Added!");
				index++;
			}

			else
				System.out.println("Error, try again.");

			//If index is at 10, loop ends. If not, go again
			if (index == 10) 
				complete = true;

			else
				System.out.println();

		}

		return stor;
	}


}
