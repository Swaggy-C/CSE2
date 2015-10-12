/* Carter Prevost
CSE 002, Section 110
HW 07
October 12, 2015

This program creates a pattern consisting of /, \, and #. 

*/


//import scanner
import java.util.*;


//add "Twisty" class
public class Twisty
{
    //add main method
    public static void main(String[] args) 
    {
        //create Scanner instance
        Scanner sc = new Scanner(System.in);
        int length = 0; //declare length variable that determines how many characters the pattern covers horizontally
        int width = 0; //declare width variable that determines how many characters the pattern covers vertically
        
        
        //create boolean to control error loop
        boolean spooky1 = true;
        boolean spooky2 = true; 
        
        
        /* prompt user for length with do while loop that controls error messages */
        
        do 
        {
            System.out.print("Input your desired length: ");
            if (sc.hasNextInt())
            {
                length = sc.nextInt(); 
                if (length > 0 && length < 81)
                {
                    spooky1 = false; 
                }
                else
                {
                    System.out.println("Error: please enter an integer from 0-80. ");
                    
                }
            }
            else 
            {
                System.out.println("Error: please enter an integer value. "); 
            }
            sc.nextLine(); 
        }
        while (spooky1); 
        
        
        /* prompt user for width with do while loop that prints errors */
        
        do
        {
            System.out.print("Input your desired width: ");
            if (sc.hasNextInt())
            {
                width = sc.nextInt();
                if (width > 0 && width < length)
                {
                    spooky2 = false; 
                }
                else
                {
                    System.out.println("Error: please enter a positive integer less than the length. ");
                }
            }
            else
            {
                System.out.println("Error: please enter an integer value. ");
            }
            sc.nextLine();
        }
        while (spooky2);
        
        
        
        // for loop that loops through each line
        
        for (int i = 0; i < width; i++)
        {
            //for loop that prints #, \, or / 
            for (int j = 0; j < length; j++)
            {
                if (i == (j%width)) 
                {
                    if ( (int) (j / width) % 2 == 0) 
                    {
                        System.out.print("#");
                    }
                    else 
                    {
                        System.out.print("\\"); //must use \\ to print \ 
                    }
                }
                else if ((j % width) == width - i - 1)
                {
                    if ( (int) ( j / width) % 2 == 0)
                    {
                        System.out.print("/");
                    }
                    else 
                    {
                        System.out.print("#");
                    }
                }
                else 
                {
                    System.out.print(" ");  //I originally forgot to put the space and was very frustrated for a long time. 
                }
            }
            System.out.println(); 
        }
        
    } // end main method
} // end "Twisty" class 