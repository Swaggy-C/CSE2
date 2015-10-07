/* Carter Prevost
CSE 002, Section 110
Homework 06
October 4, 2015

This program allows a user to input their daily expenses and caluclates the average daily expenses for the week and for four
years assuming the average weekly expense varies between 80 percent and 120 percent. Also, it display a asterisk bar graph to compare
each day's expenses visually. */

//import Scanner and DecimalFormat  
import java.util.*; 
import java.text.NumberFormat;  


//define a class
public class BarGraph{
    //add main method
    public static void main(String[] args) {
        
        //define expenses 
        double exp1=0, exp2=0, exp3=0, exp4=0, exp5=0, exp6=0, exp7=0; 
        boolean d1=true, d2=true, d3=true, d4=true, d5=true, d6=true, d7=true;  
        //define an instance of the scanner
        Scanner myScanner = new Scanner(System.in); 
        
        
            
            //create instance of number formatter for currency
            //I had trouble figuring out how to do this with loops so I used something I read about once
            
            NumberFormat nf = NumberFormat.getCurrencyInstance(); 
        
        /* Use 7 do while loops to prompt user for a positive, double value for their daily expenses.
        Use if statements to determine if the user input is in dollar format. */
        
        
           do {
                System.out.print("Enter Monday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp1 = myScanner.nextDouble();
                    System.out.println(nf.format(exp1)); 
                        if (exp1 > 0) {
                             
                            d1=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d1); 
            
            
            do {
                System.out.print("Enter Tuesday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp2 = myScanner.nextDouble();
                    System.out.println(nf.format(exp2));
                        if (exp2 > 0) {
                             
                            d2=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d2); 
            
            
            do {
                System.out.print("Enter Wednesday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp3 = myScanner.nextDouble();
                    System.out.println(nf.format(exp3));
                        if (exp3 > 0) {
                            
                            d3=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d3); 
            
            
            do {
                System.out.print("Enter Thursday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp4 = myScanner.nextDouble();
                    System.out.println(nf.format(exp4));
                        if (exp4 > 0) {
                             
                            d4=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d4); 
            
            
            do {
                System.out.print("Enter Friday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp5 = myScanner.nextDouble();
                    System.out.println(nf.format(exp5));
                        if (exp5 > 0) {
                             
                            d5=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d5); 
            
            
            do {
                System.out.print("Enter Saturday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp6 = myScanner.nextDouble();
                    System.out.println(nf.format(exp6));
                        if (exp6 > 0) {
                             
                            d6=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d6); 
            
            
            do {
                System.out.print("Enter Sunday's expenses: $"); 
                if (myScanner.hasNextDouble()) {
                    exp7 = myScanner.nextDouble();
                    System.out.println(nf.format(exp7));
                        if (exp7 > 0) {
                             
                            d7=false; 
                            
                        } 
                            else {
                                System.out.println("Please enter a positive number."); 
                            }

           }
            else {
                System.out.println("Sorry, you did not enter a double value. ");
                   
            }
            myScanner.nextLine();
            }  while (d7); 
            
            /*Use for statements to print out an asterisk bar graph for each daily expense 
            where each asterisk is 1 dollar. */
            System.out.print("Monday: ");
            for (int i=0; i<exp1; i+=1) {
                System.out.print("*"); 
                
            }
            System.out.println("");
            System.out.print("Tuesday: ");
            for (int i=0; i<exp2; i+=1) {
                
                System.out.print("*"); 
                
            }
            
            System.out.println("");
            System.out.print("Wednesday: ");
            
            
            for (int i=0; i<exp3; i+=1) {
               
                System.out.print("*"); 
                
            }
            
            System.out.println("");
            System.out.print("Thursday: ");
            
            for (int i=0; i<exp4; i+=1) {
                
                System.out.print("*"); 
                
            }
            
            System.out.println("");
            System.out.print("Friday: ");
           
            for (int i=0; i<exp5; i+=1) {
                
                System.out.print("*"); 
                
            }
            
            System.out.println("");
            System.out.print("Saturday: ");
            
            for (int i=0; i<exp6; i+=1) {
                
                System.out.print("*"); 
                
            }
            
            System.out.println("");
            System.out.print("Sunday: ");
            
            for (int i=0; i<exp7; i+=1) {
                
                System.out.print("*"); 
                
            }
            
            System.out.println(""); 
            //Find average daily expenses and print it out
          
          Double ade= (exp1 + exp2 + exp3 + exp4 + exp5 + exp6 + exp7)/7; 
          System.out.println("Your average daily expenses are: $" + nf.format(ade)); 
          
          double adenew=0, intermediate=0; 
          double multiplier = (Math.random()*1.2)+.8;
          
          // for loop that adds each average weekly expense (multiplied by a number between 80 and 120 %) for 4 years
              for (int i=0; i<=208; i++) {
                  intermediate = ade * multiplier; 
                  adenew = adenew + intermediate; 
                 

              }
          System.out.println("Estimated expenditure for 4 years: $" + nf.format(adenew)); 
          
          
    }
}


            