/* Carter Prevost
CSE 002, Section 110
Lab 07
October 9, 2015

This program hides a secret message "X" within a user-determined number of asterisks.  */


//import scanner 
import java.util.*;

//add encrypted_x class
public class encrypted_x 
{
    //add main method
    public static void main(String[] args)
    {
        //declare Scanner instance "myScanner"
        Scanner myScanner = new Scanner(System.in); 
        
        //create boolean to control while loop for error statements
        boolean isAllGoodHomie = true; 
        //declare input variable 
        int input = 0; 
        
        /*prompt user for an integer between 0 and 100 using a do while loop that prints out errors.  
        This will determine the size of the square that captures the X.
        */
        
        
        
        do 
        {
            System.out.print("Please enter an integer from 0-100: "); 
            if (myScanner.hasNextInt()) 
            {
                input = myScanner.nextInt(); 
                    if (input > 0 && input < 100)
                    {
                        isAllGoodHomie = false; 
                    }
                    else 
                    {
                        System.out.println("Sorry, you did not enter a value from 0-100. "); 
                    }
            }
            else 
            {
                System.out.println("Sorry, you did not enter an integer value. " ); 
            }
            myScanner.nextLine(); 
        }
        while (isAllGoodHomie); 
        
   
        

        
            //for loop that determines the number of lines
            for (int i=0; i<=input; i++)
            {
                System.out.println(); 
                //nested for loop that will determine when to place * or a blank space 
                for (int j=0; j < input + 1; j++)
                {
                    //if statement that determines whether an * or blank space will be printed
                    if (j==i || j == (input - i)) 
                    {
                        System.out.print(" ");
                    }
                    else 
                    {
                        System.out.print("*"); 
                    }
                }
            }
            
            System.out.println(); 
    } //end main method
}//end encrypted_x class 