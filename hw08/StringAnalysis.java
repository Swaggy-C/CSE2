/* Carter Prevost
CSE 002, Section 110
hw08
October 18, 2015

This program analyzes a string and checks if all the characters are letters. It can check a specific number
of characters if the user desires to do so. */

import java.util.*;

// add StringAnalysis class
public class StringAnalysis
{
    //method to analyze string that only accepts String 
    public static boolean Analysis(String word)
    {
        boolean control = false; //boolean that helps control loop behavior and analysis 
        
        //loop through string and check if all characters are letters
        for (int i=0; i < word.length(); i++)
        {
            control = Character.isLetter(word.charAt(i)); 
            
            if (control == false)
            {
                break; 
            }
            
        } //end for loop 
        
        return control; 
        
    } //end Analysis method
    
    
    // method to analyze string that accepts a string and int 
    public static boolean Analysis(String word, int num)
    {
        boolean control = false; //boolean that helps control loop behavior and analysis 
        
        // loop through string and check if all characters are letters
        for (int i=0; i < num; i++)
        {
           control = Character.isLetter(word.charAt(i)); 
           
           if (control == false)
           {
               break; 
           }
        } //end for loop
        
        return control; 
        
    } // end analysis method
    
    
    //add main method
    
    public static void main(String[] args) 
    {
        
        //create Scanner instance
        Scanner sc = new Scanner(System.in);
        
        //prompt user for String to analyze
        System.out.print("Please enter a string to analyze: ");
        String word = sc.nextLine();
        
        //prompt user for the type of analysis to be done 
        System.out.print("Please choose an analysis option. a. Examine all characters in the given string. b. Examine a specified number of characters. ");
        String option = sc.nextLine(); 
        
        
        //while loop to force user to enter "a" or "b"
        
        while (true)
        {
            if ( option.equals("a") || option.equals("b") )
            {
                break; 
            }
            else 
            {
                System.out.print("Please enter 'a' or 'b'.  ");
                option = sc.nextLine(); 
            }
        } //end while loop
        
        
        int num = 0; 
        
        //if user chooses option 'a' perform analysis 
        if ( option.equals("a") )
        {
            if ( Analysis(word) )
            {
                System.out.println("This string contains only letters. ");
            }
            else 
            {
                System.out.println("This string contains characters that are not letters. ");
            }
        }
        //if user chooses option 'b' perform analysis 
        else if ( option.equals("b") )
        {
            //prompt user for number of characters to be checked in the string
            System.out.print("Please enter the number of characters to be checked in your string: ");
            
            
            // force user to enter an int with a while loop
            
            while (true)
            {
               if (sc.hasNextInt())
               {
                   num = sc.nextInt(); 
                   break; //break if user inputs an int
               }
               else 
               {
                   System.out.print("Please enter an int: ");
                   sc.nextLine(); 
               }
            } // end while loop
            
            //if statement that checks if all characters are letters using analysis method 
            if (num >= word.length())
            {
                if (Analysis(word))
                {
                    System.out.println("This string contains only letters. ");
                    
                }
                else 
                {
                    System.out.println("This string contains characters that are not letters. ");
                    
                }
            }
            else 
            {
                //use Analysis method (that accpets string and int) to check the number of characters
                if (Analysis(word, num))
                {
                    System.out.println("The first " + num + " characters of this string are letters. ");
                    
                }
                else 
                {
                    System.out.println("The first " + num + " characters of this string are not all letters. ");
                }
            }
            
            
            
        } // end if statement to control analysis for both options 
        
        
    }// end main method
    
    
    
}//end StringAnalysis class 