/* Carter Prevost
CSE 002 HW 11
November 10, 2015


This program accepts 15 integers as input from a user and sorts them from smallest to largest. Using linear search, it finds
a key entered by the user. Next, it scrambles the grades and performs linear search again. */

import java.util.*; 

// add CSE2Linear class
public class CSE2Linear
{
    public static void printArray(int[] P)
    {
        for (int i=0; i < P.length; i++)
        {
            System.out.print(P[i] + " ");
        }
        System.out.println(); 
    } //end printArray method
    
    //method that scrambles an inputed array 
    public static void scramble(int[] A)
    {
    	for (int i=0; i<A.length; i++)
    	{
    	    int temp = A[0]; 
    	    int x = (int)(Math.random()*A.length);
    	    A[0] = A[x];
    	    A[x] = temp; 
    	    
    	}
    } //end scramble method 
    
    public static void selectionSort(int[] list)
    {
        for (int i=0; i < (list.length - 1); i++)
        {
            int curMin = list[i];
            int curMinIndex = i; 
        
        // if there is a number less than the current minimum, change the current minimum to that number 
            for (int j = i + 1; j < list.length; j++)
            {
                if (curMin > list[j])
                {
                    curMin = list[j];
                    curMinIndex = j;
                }
            }
            //swap the values if new minimum is found 
            if (curMinIndex != i)
            {
                list[curMinIndex] = list[i];
                list[i] = curMin; 
            }
        }
    } // end selectionSort method 
    
    
    public static void linearSearch(int[] A, int key)
    {
        for (int i=0; i < A.length; i++)
        {
            if (A[i] == key)
            {
                System.out.println(key + " was found in " + i + " iterations. ");
                return; 
            }
        }
        System.out.println(key + " was not found in the search. "); 
    } //end linearSearch method 
    
    
    //add main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //create scanner instance
        int[] grades; 
        grades = new int[15]; 
        
        
        //control error messages for integer inputs
        int num = 0; 
        for (int i=0; i < 15; i++)
        {
            boolean good = true; 
            while (good)
            {
                System.out.print("Enter 15 ints for final grades in CSE2: ");
                if (sc.hasNextInt())
                {
                    num = sc.nextInt();
                    good = false; 
                    if (num < 0 || num > 100)
                    {
                        System.out.println("Please enter an int between 0 and 100.");
                        good = true; 
                    }
                }
                else 
                {
                    System.out.println("Please enter an int.");
                    System.out.print("Enter an int: ");
                    sc.next();
                }
                
            } // end while loop
            grades[i] = num; 
        } //end for loop  
       
        
        //sort inputed grades from smallest to largest
        selectionSort(grades);
        System.out.println("Sorted: ");
        printArray(grades); //print sorted array of grades 
        System.out.print("Enter a grade to search for: ");
        int input = sc.nextInt(); 
        linearSearch(grades, input); //use linear search method to find inputed key
        scramble(grades); //scramble the grades
        System.out.println("Scrambled: ");
        printArray(grades); //print scrambled grades
        System.out.print("Enter a grade to search for: ");
        input = sc.nextInt();
        linearSearch(grades, input); 
        
        
    }//end main method
} //end CSE2Linear class