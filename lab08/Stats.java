/* Carter Prevost 
CSE 002, Section 110
October 16, 2015
Lab 08

This program prompts a user for 5 numbers and returns the mean and median. */


import java.util.*; //import Scanner 

//add Stats class
public class Stats{
    
    
    //Mean method
    public static double mean(double a, double b, double c, double d, double e)
    {
        double mean = (a + b + c + d +e)/5;
        return mean;
    }
    
    
    //Median method
    public static double median(double c)
    {
        double median = c; 
        return median; 
    }
    
   
    
    //Output method that prints the mean and median 
    public static void output(double mean, double median)
    {
        System.out.println("The mean is: " + mean);
        System.out.println("The median is: " + median);
  
    }
    
    // main method
    public static void main(String[] args)
    {
        //create Scanner instance
        Scanner sc = new Scanner(System.in); 
        
        //prompt user for 5 doubles in increasing order
        
        System.out.print("Please enter the first number: "); 
        double a = sc.nextDouble();
        
        System.out.print("Please enter the second number: ");
        double b = sc.nextDouble();
        while (a>b)
        {
            System.out.println("Enter the numbers in increasing order. ");
            System.out.print("Please enter the second number: ");
            b = sc.nextDouble();
        }
        
        System.out.print("Please enter the third number: ");
        double c = sc.nextDouble();
        while (b>c)
        {
            System.out.println("Enter the numbers in increasing order. ");
            System.out.print("Please enter the third number: ");
            c = sc.nextDouble();
        }
        
        System.out.print("Please enter the fourth number: ");
        double d = sc.nextDouble();
        while (c>d)
        {
            System.out.println("Enter the numbers in increasing order. ");
            System.out.print("Please enter the fourth number: ");
            d = sc.nextDouble();
        }
        
        System.out.print("Please enter the fifth number: ");
        double e = sc.nextDouble();
        while (d>e) 
        {
            System.out.println("Enter the numbers in increasing order. ");
            System.out.print("Please enter the fifth number: ");
            e = sc.nextDouble(); 
        }
        
        output(mean(a,b,c,d,e), median(c)); 
    }
    
}
