import java.util.Scanner;

public class leap_year
{
	public static void main(String args[])
	{
		Scanner year = new Scanner(System.in); 		//create a object for Scanning value
		System.out.println("\n\nEnter the year: ");
		int yr = year.nextInt();			//yr varialble, year object and nextInt() function

		if(yr % 4 == 0)		// Condition to find leap year
		{
			System.out.println("Given year is leap.");
		}
		else
		{
			System.out.println("Given year is not leap.");
		}
	}
}

/*
OUTPUT

Enter the year:
2020
Given year is leap.


Enter the year:
2018
Given year is not leap.


Enter the year:
2024
Given year is leap.
*/
