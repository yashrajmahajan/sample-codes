import java.util.Scanner;		//Scanner lib in java

class Scan_value
{
	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);		//create a object READ
		System.out.println("\n\nEnter the value:");
		int number = read.nextInt();			// number varialble to store value and use Function nextInt() using object READ
		System.out.println("you entered: "+number);
	}
}

/*
OUTPUT

Enter the value:
4
you entered: 4
*/
