import java.util.Scanner;

public class case_calculator
{
	public static void main(String args[])
	{
		Scanner calcu = new Scanner(System.in);				//create a object of Scanning CALCU
		System.out.println("\n\nWellcome to java calculator\n\n");

		int num1 = calcu.nextInt();				//int input in java

		char ch = calcu.next().charAt(0);			// char input in java

		int num2 = calcu.nextInt();

	switch (ch)
	{

		case '+':
			num1 = num1 + num2;
			System.out.println("\n="+num1);			//Addition case
			break;

		case '-':
			num1 = num1 - num2;
			System.out.println("\n="+num1);			//Substraction case
			break;

		case '*':
                        num1 = num1 * num2;
                        System.out.println("\n="+num1);			//Multiplcation case
                        break;

		case '/':
                        num1 = num1 / num2;
                        System.out.println("\n="+num1);			//Division case
                        break;

		default:
			System.out.println("Please choose valid operation");
	}
	}
}
/*
OUTPUT

Wellcome to java calculator


2
+
3

=5


Wellcome to java calculator

3
*
4

=12


Wellcome to java calculator


5
/
2

=2


Wellcome to java calculator


4
-
2

=2
