// *****************************************************************************
// * Student Name: Mark Land                          Moorpark College         *
// * Program Name: Lab03_B_For.java                   CS M10J (Intro Java)     *
// * Comment     : For Loop Program                   Intro to Prog using Java *
// *               ch. 5, pg. 321-322,         	      Fall of 2015             *
// *               Prog Exer #9(a,b,c),10,11          Prof. John C. Reynolds   *
// *****************************************************************************

/*
Program Purpose:

The purpose of this program is to get two different numbers, and for the range
inclusively between the two numbers, output the odds and the sum of the evens.
*/

// Packages~Libraries~Modules:

import java.util.Scanner;

// Classes:

public class Lab03_B_For
{
	// Constants ~ Variables ~ Object Instantiation:
	
	static Scanner console = new Scanner(System.in);
	
	static int number_1, number_2, counter, sum = 0;
	
	// Methods~Functions:
	
	public static void main (String[] args)
	{	
		// program:
		
		Header();
		Purpose();
		Program();
	}
	
	public static void Header ()
	{
		// Header Info Displayment:

		System.out.println("\n\n****************************************" +
			"****************************************");
		System.out.println("* Student Name: Mark Land                        " +
			"     Moorpark College         *");
		System.out.println("* Program Name: Lab03_B_For.java                   "
			+ "   CS M10J (Intro Java)     *");
		System.out.println("* Comment     : For Loop Program                   "
			+ "   Intro to Prog using Java *");
		System.out.println("*               ch. 5, pg. 321-322,         	   "
			+ "   Fall of 2015             *");
		System.out.println("*               Prog Exer #9(a,b,c),10,11          "
			+ "   Prof. John C. Reynolds   *");
		System.out.println("****************************************" +
			"****************************************\n\n");
	}
	
	public static void Purpose ()
	{
		// Purpose Displayment:
		
		System.out.println("The purpose of this program is to get two \n" +
			"different numbers, and for the range inclusively between the two\n"
			+ "numbers, output the odds and the sum of the evens\n\n");
	}
	
	public static void Program ()
	{
		// prompt and input from user:
		
		System.out.print("Enter a number: ");
		number_1 = console.nextInt();
		
		System.out.printf("Enter a number greater than %d: ", number_1);
		number_2 = console.nextInt();
		
		System.out.println();
		
		// Setting the counter to minimum range for the 'while' loop:
		
		counter = number_1;
		
		// checking, operation, output:
		
		if (number_1 < number_2)
		{
			// odds output prompt:
		
			System.out.printf("%nThe odd numbers inclusively between %d and %d "
				+ "is: %n%n", number_1, number_2);
			
			for (counter = number_1; counter <= number_2; counter++)
			{
				if (counter % 2 != 0)
				{
					System.out.println(counter);
				}
				else if (counter % 2 == 0)
				{
					sum = sum + counter;
				}
			}
		}
		else if (number_1 >= number_2)
		{
			System.out.println("\nThe first number must be greater than the "
				+ "second number, wrong input, try again\n");
			Program();
		}
		else
		{
			System.out.println("\nWrong input, try again\n");
			Program();
		}
		
		// output:
		
		System.out.printf("\nThe sum of the even numbers is: %d%n%n", sum);
	}
}

/*
I don't understand why~how, but when you do a wrong input, and the
program loops, and you then type in a correct input, it displays the
cost output twice (or more: depends on the number of loops ~ wrong
inputs). This is a bit strange 'order of operations' with the scripting.
I've not tried it, but I'm guessing putting the cost output into the
proper 'else ifs' will fix this issue, but that still leaves the
question of why~how is it doing this, when (seemingly) logically it
doesn't make any sense (at least me, currently anyways).
*/
