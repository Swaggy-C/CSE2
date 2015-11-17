/* Carter Prevost
CSE 002
Professor Chen
hw12 Transpose.java
This program asks a user for a number of rows and columns and generates a random matrix using ints from -10 to 10. 
Next, it generates the transpose of the matrix. 
*/

import java.util.*; 

//add Transpose class
public class Transpose
{
    public static int[][] randomMatrix(int height, int width)
    {
        int[][] randArray = new int[height][width];
        for (int i=0; i < randArray.length; i++)
        {
            for (int j=0; j < randArray[i].length; j++)
            {
                randArray[i][j] = (int)(Math.random()*21)-10; 
            }
        }
        return randArray; 
    } //end randomMatrix method
    
    
    public static void printMatrix(int[][] A)
    {
        int check = A[0].length; 
        for (int i=1; i < A.length; i++)
        {
            if (A[i].length != check) //check if matrix is rectangular 
            {
                System.out.println("This matrix is not rectangular!"); 
            }
        }
        
        for (int j=0; j < A.length; j++)
        {
            for (int k=0; k < A[j].length; k++)
            {
                System.out.print(A[j][k] + " "); 
            }
            System.out.println();  
        }
        System.out.println(); 
    } //end printMatrix method
    
    
   public static int[][] transposeMatrix(int[][] A)
    {
        int[][] Atrans = new int[A[0].length][A.length]; 
        for (int i=0; i < A[0].length; i++)
        {
            for (int j=0; j < A.length; j++)
            {
                Atrans[i][j] = A[j][i]; 
            }
        }
        return Atrans; 
    } //end transposeMatrix method 
    
    //add main method
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int height = 0;
        int width = 0; 
        boolean good1 = true; 
        boolean good2 = true; 
        
        while(good1)
        {
            System.out.println("Please enter a height: ");
            if (sc.hasNextInt())
            {
                height = sc.nextInt(); 
                good1 = false;
                if (height < 0)
                {
                    System.out.println("Please enter a positive int. ");
                    good1 = true; 
                }
            }
            else 
            {
                System.out.println("Please enter an int. ");
                System.out.print("Enter an int: ");
                sc.next(); 
            }
        }
        
        
        while(good2)
        {
            System.out.println("Please enter a width: ");
            if (sc.hasNextInt())
            {
                width = sc.nextInt(); 
                good2 = false;
                if (width < 0)
                {
                    System.out.println("Please enter a positive int. ");
                    good2 = true; 
                }
            }
            else 
            {
                System.out.println("Please enter an int. ");
                System.out.print("Enter an int: ");
                sc.next(); 
            }
        }
        System.out.println("Random matrix: ");
        int[][] randArray = randomMatrix(height, width);
        printMatrix(randArray);
        System.out.println("Transposed matrix: ");
        int[][] Atrans = transposeMatrix(randArray); 
        printMatrix(Atrans); 
        
    } //end main method


}// end Transpose class
