//Carter Prevost
//CSE 002, Section 110
//September 13, 2015
/* This program determines how much time there is until a person must have dinner */


import java.util.Scanner; //import scanner 

//Define a class
public class Timer{
//Add main method
    public static void main(String[] args) {
        Scanner myScanner2= new Scanner(System.in); //create scanner instance
        //prompt user for the current time using military time where the first two digits are the hour and the last two digits are minutes
            System.out.print("Enter current time in the form HHMM: "); 
        //Accept user input for current time
            int currentTime= myScanner2.nextInt(); 
        //prompt user the for time at which the user will eat dinner
            System.out.print("Enter the time that you will be eating dinner: ");
        //Accept user input for dinner time
            int dinnerTime= myScanner2.nextInt();
        //Define time until dinner as the difference between the dinner time and the current time
            int timeUntilDinner= dinnerTime-currentTime; 
            //Define the number of hours left until dinner as a whole number and the number of minutes left as a whole number
                int hours,
                    minutes; 
                //Define hours so that they can be used for calculations. 
                    int currentTimeHours=( currentTime-(currentTime%100))/100;
                    int dinnerTimeHours=dinnerTime/100;
            //Use modulus function to return the number of hours as a whole number from the military time input
                minutes= timeUntilDinner % 100; 
            //Return number of minutes as a whole number
                hours= dinnerTimeHours-currentTimeHours; 
                //Print out the hours and minutes until dinner
                System.out.print("You have "+hours+" hours and "+minutes+" minutes until dinner. "); 
                
            
            
    } //end of main method
} //end of class 