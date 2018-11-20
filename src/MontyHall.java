import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Jonathan Kerns
 * Period 1
 *
 */
public class MontyHall 
{

	public static void main (String []args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Which door would you like to pick: ");
		int door = keyboard.nextInt();
		int car = rand.nextInt(3) + 1;
		
		if (car == 1)
		{
			System.out.println("The car was behind Door #1!");
		}
		if (car == 2)
		{
			System.out.println("The car was behind Door #2!");
		}
		if (car == 3)
		{
			System.out.println("The car was behind Door #2!");
		}
		
		if (door == 1)
		{
			System.out.println("You picked Door #1.");
		}
		else if (door == 2)
		{
			System.out.println("You picked Door #2.");
		}
		else if (door == 3)
		{
			System.out.println("You picked Door #3.");
		}
		else 
		{
			System.out.println("You picked an invalid door.");
		}
		
	}
}
