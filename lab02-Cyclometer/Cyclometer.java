//Carter Prevost
//CSE2 Section 110
//September 4, 2015
//describe program


//Define Class
public class Cyclometer{
//Add main method
    public static void main(String[] args) {
        
        int secsTrip1=480; //Define the number of seconds for trip 1
        int secsTrip2=3220; //Define the number of seconds for trip 2
        int countsTrip1=1561; //Define the number of revolutions of the front wheel in trip 1
        int countsTrip2=9037; //Define the number of revolutions of the front wheel in trip 2
        
        double wheelDiameter=27.0, //Size of front wheel's diameter 
             PI=3.14159, //Define PI as a terminating decimal 
             feetPerMile=5280, //Define the number of feet in one mile
             inchesPerFoot=12, //Define the number of inches in one foot
             secondsPerMinute=60; //Define the number of seconds in one minute
        double distanceTrip1, distanceTrip2, totalDistance; //Define the distances traveled in Trips 1 and 2 and the total distance traveled 
        
        
        System.out.println(" Trip 1 Took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+countsTrip1+ " counts. "); 
            //Above prints the number of minutes Trip 1 took and the number of counts for Trip 1
        System.out.println(" Trip 2 Took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+countsTrip2+ " counts. "); 
            //Above prints the number of minutes Trip 2 took and the number of counts for Trip 2
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; 
            //Above gives distance traveled in Trip 1 in inches
            //For each count (or revolution), a rotation of the wheel travels the diameter in inches times PI. 
        distanceTrip1/=inchesPerFoot*feetPerMile; //Convert distance 1 from inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI;
            //Above gives distance traveled in Trip 2 in inches
        distanceTrip2/=inchesPerFoot*feetPerMile; //Comvert distance 2 from inches to miles
        
        totalDistance=distanceTrip1+distanceTrip2; //Total distance traveled is the sum of the distances from Trips 1 and 2
        
        //Print output data
        System.out.println(" Trip 1 was "+distanceTrip1+" miles"); 
        System.out.println(" Trip 2 was "+distanceTrip2+" miles");
        System.out.println(" The total distance was "+totalDistance+" miles"); 
    
    }  //end main method
}  //end of class 