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
		
		
		int goat = 0;
		
		if ((car == 1)&&(door == 1))
		{
			System.out.println("There is a goat behind Door #2");
			goat = 2;
		}
		else if ((car == 2)&&(door == 2))
		{
			System.out.println("There is a goat behind Door #3");
			goat = 3;
		}
		else if ((car == 3)&&(door == 3))
		{
			System.out.println("There is a goat behind Door #1");
			goat = 1;
		}
		else if ((car == 1)&&(door == 2))
		{
			System.out.println("There is a goat behind Door #3");
			goat = 3;
		}
		else if ((car == 1)&&(door == 3))
		{
			System.out.println("There is a goat behind Door #2");
			goat = 2;
		}
		else if ((car == 2)&&(door == 1))
		{
			System.out.println("There is a goat behind Door #3");
			goat = 3;
		}
		else if ((car == 2)&&(door == 3))
		{
			System.out.println("There is a goat behind Door #1");
			goat = 1;
		}
		else if ((car == 3)&&(door == 1))
		{
			System.out.println("There is a goat behind Door #2");
			goat = 2;
		}
		else if ((car == 3)&&(door == 2))
		{
			System.out.println("There is a goat behind Door #1");
			goat = 1;
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to change your pick? ");
		String answer = in.nextLine();
		
		if ((answer.equals("yes"))&&(goat == 1)&&(door == 2))
		{
			door = 3;
		}
		else if ((answer.equals("yes"))&&(goat == 1)&&(door == 3))
		{
			door = 2;
		}
		else if ((answer.equals("yes"))&&(goat == 2)&&(door == 1))
		{
			door = 3;
		}
		else if ((answer.equals("yes"))&&(goat == 2)&&(door == 3))
		{
			door = 1;
		}
		else if ((answer.equals("yes"))&&(goat == 3)&&(door == 1))
		{
			door = 2;
		}
		else if ((answer.equals("yes"))&&(goat == 3)&&(door == 2));
		{
			door = 1;
		}
		
		if (car == 1)
		{
			System.out.println("The car was behind Door #1!");
		}
		else if (car == 2)
		{
			System.out.println("The car was behind Door #2!");
		}
		else if (car == 3)
		{
			System.out.println("The car was behind Door #2!");
		}
		
		if (car == door)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("You lost.");
		}
		
		
	}
}
