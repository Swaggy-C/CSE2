
/* Carter Prevost
CSE 002, Section 110
October 6, 2015
Homework 06
This program checks ISBN-10 codes */

import java.util.*;
import java.lang.*;

//add CheckDigit class
public class CheckDigit
{
	// add main method
	public static void main(String[] args)

	{

		String isbn; // define isbn string
		Scanner myScanner = new Scanner(System.in); // create scanner instance

		int sum = 0; // define sum for isbn code
		int last = 0; // define last digit of isbn code

		boolean control = true; // boolean to help control behavior of loops */

		do
		{
			System.out.print("Please enter a 10 digit barcode: ");
			isbn = myScanner.nextLine();

			if (isbn.length() < 10)
			{
				control = true;
				while (control = true)
				{
					System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
					isbn = myScanner.nextLine();
					if (isbn.length() == 10)
					{
						control = false;
					}
				}
			}

			if (isbn.length() > 10)
			{
				control = true;
				while (control = true)
					;
				{
					System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
					isbn = myScanner.nextLine();
					if (isbn.length() == 10)
					{
						control = false;
					}
				}
			}
			// sum of digits in isbn
			for (int i = 0; i < isbn.length() - 1;)
			{ // for loop that goes through each number in the isbn code
				for (int j = 10; j > 1; j--)
				{ // for loop that multiplies the numbers in the isbn code by
					// proper numbers
					sum += Character.getNumericValue(isbn.charAt(i)) * j; // Did
					i++;
				}
			}
			last = sum % 11; // find the value for the check digit

			if (last == 10)
			{ // if statement that defines the check digit as 'X' if it is 10
				last = (char) 'X';
			}
			if (Character.getNumericValue(isbn.charAt(9)) == last)
			{ // if statement that checks for correct last digit
				System.out.println("This is a valid ISBN");
			} else
			{
				System.out.println("This is NOT a valid ISBN. Check Digit should be " + last);
				last--;
			}

		} while (Character.getNumericValue(isbn.charAt(9)) != last);

	}
}
