/* Carter Prevost
Lab 06
CSE 002
October 2, 2015

DESCRIBE THE PROGRAMMMMMMMMMMMMMMMMMMMMMMM   */

//define a class
public class GettingLoopy{
    //add main method
    public static void main(String[] args) {
        
        //for loop that prints out 12345677777
       for (int m=1; m<7; ++m) {
            System.out.print(m); 
        } 
        /*for (int i=7; i<8; i=i) {   this is an infinite loop  *do not use this* control-c to stop it 
            System.out.print(i); 
        } */ 
        
        System.out.println("");
        
        //while loop that prints out prime numbers between 10 and 100
    /*  int k = 10; 
        int factors = 0; 
        
            while (k<=100){
                    int d = 1; 
                while (d<=100){
                    if (k%d == 0){
                        factors++;
                        d++;
                    }
                    else{
                        d++;
                    }
                    if (factors==2){
                        System.out.print(k);
                    }
            }
            } 
            
            System.out.println(""); */ 
            
        //for loop that prints out prime numbers between 10 and 100
        int w=0, j=0, i=0; 
        for (i=10; i<=100; i++) {    
          //Determine divisbility of each i starting at j=2. 
          for (j=2; j<=i; j++) {
            if (i%j==0) {
              //count the number of divisors for i
              w++;
            }
          }
          //if the number of divisors equals 1, the number must be prime
          if (w==1) {
            System.out.print(i+" ");  
            } 
          //Force k=0 for each loop 
          w=0; 
        }
            
        
    }
}