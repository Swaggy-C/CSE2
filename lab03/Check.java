//Carter Prevost
//CSE 002, Section 110
//September 11, 2015
/* This program takes the cost of a check and the tip percentage for a meal
shared by a group of friends and calculates the amount of money each friend
must pay. */ 


import java.util.Scanner;  //import Scanner 

//Define a class
public class Check{   
//Add main method
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);  //create Scanner instance 
        //prompt user for original cost of the check in dollar format
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
        //Accept user input for check cost
            double checkCost= myScanner.nextDouble();
        //Prompt user for tip percentage 
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        //Accept user input for tip percentage
            double tipPercent= myScanner.nextDouble();
        //Convert tip percentage to a decimal value by dividing by 100
            tipPercent/=100;
        /*Prompt user for the number of people that went to the dinner.
        This will used to determine the split of the check. */
            System.out.print("Enter the number of people who went out to dinner: ");
        //Accept user input for number of people that went to dinner 
            int numPeople= myScanner.nextInt(); 
                //Define total cost and cost per person 
                double totalCost, costPerPerson; 
                //Define whole dollar amount of cost
                int dollars, 
                    dimes,    //Use these values to store digits to the right of the decimal point. 
                    pennies; 
            //Define total cost as the check cost multiplied by the 1 + the tip percentage as a decimal.
            totalCost= checkCost*(1+tipPercent);
            //Define the cost per person as the total cost divided by the number of people present.
            costPerPerson= totalCost/numPeople; 
            //Retrieve the number of dollars as a whole number by truncating the decimal.
            dollars= (int) costPerPerson; 
            //Retrieve the dimes ammount by using the modulus (%) operator to return the remainder
            //For example, (int) (6.73*10) % yields 67 % 10 yields 7.
            dimes= (int) (costPerPerson*10) % 10; 
            //Retrieve the pennies ammount using the same method except use a 100 instead of a 10 for the multiplication.
            pennies= (int) (costPerPerson*100) % 10; 
            //Tell user the ammount of money that each person must pay
            System.out.println("Each person in the group owes $" +dollars+ '.' +dimes + pennies); 
            
            
}  //end of main method
    } //end of class 



 

