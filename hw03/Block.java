//Carter Prevost
//CSE 002, Section 110
//September 13, 2015
/* This program calculates and returns the volume and surface area of a block. */

import java.util.Scanner; //import Scanner

//define a class
public class Block{
    //add main method
    public static void main(String[] args) {
        Scanner myScanner3= new Scanner(System.in); //create an instance of Scanner
        
            //Define the length, width and height of the block as doubles
            
                //prompt user for the length of the block
                System.out.print("Enter the length of the block: ");
                double blockLength= myScanner3.nextDouble();
                //prompt user for the width of the block
                System.out.print("Enter the width of the block: ");
                double blockWidth= myScanner3.nextDouble();
                //prompt user for the height of the block 
                System.out.print("Enter the height of the block: ");
                double blockHeight= myScanner3.nextDouble();
                
            //Define the volume of the block as the product of its length, width, and height.
            double blockVolume=blockLength*blockWidth*blockHeight; 
            /* Define the surface area of the block as 
             2(width*height) + 2(height*length) + 2(width*length) */
            double blockSurfaceArea=(2*blockWidth*blockHeight)+(2*blockHeight*blockLength)+(2*blockWidth*blockLength); 
            
                //Print out the volume of the block
                System.out.println("The volume of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume+".");
                
                //Print out the surface area of the block
                System.out.println("The surface area of the block is "+blockSurfaceArea+"."); 
                
    } //end of main method
}//end of class