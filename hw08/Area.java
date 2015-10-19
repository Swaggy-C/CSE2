/* Carter Prevost
CSE 002, Section 110
hw08
October 18, 2015

This program calculates the area of a circle, triangle, or rectangle.  */


import java.util.*; //import scanner

//add Area class
public class Area
{
    
        //method that makes sure value is a double
        public static double value()
        {
            Scanner value = new Scanner(System.in);
            
            while (true) 
            {
                if (value.hasNextDouble())
                {
                    return value.nextDouble(); 
                }
                else 
                {
                    System.out.print("Error: Please enter a double value. ");
                    value.nextLine(); 
                }
            }
        }//end value method
        
        
        //method that calculates area of a circle
        public static double circle(double radius)
        {
            double PI = 3.14;
            return (radius * radius * PI); 
            
        }//end circle method
        
        //method that calculates area of a triangle
        public static double triangle(double base, double height)
        {
            return ((base*height)/2); 
        }//end triangle method 
        
        //method that calculates area of a rectangle
        public static double rectangle(double length, double width)
        {
            return (length*width); 
        }//end rectangle method
    
    
    //add main method
    public static void main(String[] args)
    {
        double radius, base, height, length, width;
        
        //create Scanner instance
        Scanner sc = new Scanner(System.in);
        
        //prompt user for shape to calculate the area
        
        System.out.println("Please enter 'circle', 'triangle', or 'rectangle' so that the area can be calculated. "); 
        String type = sc.nextLine();
        
        while (true)
        {
            if (type.equals("circle") || type.equals("triangle") || type.equals("rectangle"))
            {
                break; //break if statement if correct shape name is inputed 
            }
            else 
            {
                System.out.print("Error: Please enter 'circle', 'triangle', or 'rectangle'. ");
                type = sc.nextLine(); 
            }
        } //end while loop 
        
        
        // if circle is chosen prompt user for radius and print area
        
        if (type.equals("circle"))
        {
            System.out.print("Please enter the radius: ");
            radius = sc.nextDouble();
            System.out.println("The area of the circle is " + circle(radius));
        }
        //if triangle is chosen prompt user for base and height and print area
        else if (type.equals("triangle"))
        {
            System.out.print("Please enter the base: ");
            base = sc.nextDouble();
            System.out.print("Please enter the height: ");
            height = sc.nextDouble(); 
            System.out.println("The area of the triangle is " + triangle(base, height)); 
        }
        //if rectangle is chosen prompt user for length and width
        else if (type.equals("rectangle"))
        {
            System.out.print("Please enter the length: ");
            length = sc.nextDouble();
            System.out.print("Please enter the width: ");
            width = sc.nextDouble();
            System.out.println("The area of the rectangle is " + rectangle(length, width)); 
        }
            
        
        
        
    }// end main method
    
    
}//end Area class

