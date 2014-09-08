/* 
Jordan Hess
CSE2
9/3/14
Cyclometer program

Goals:
print the number of minutes for each trip
print the number of counts for each tirp
print the distance of each trip in miles
print the distance for the two trips combined


*/

public class Cyclometer {
    
    public static void main(String[] args) {
        
        int secsTrip1=480; //the length of trip1
        int secsTrip2=3220; //the length of trip2
        int countsTrip1=1561; //number of rotations during trip1
        int countsTrip2=9037; //number of rotations during trip2
        
        double wheelDiameter=27.0; //size of the wheel
        double PI=3.14159; //pie, yum
        int feetPerMile=5280; //feet in a mile
        int inchesPerFoot=12; // inches in a foot
        int secondsPerMinute=60; // seconds in minute
        double distanceTrip1, distanceTrip2, totalDistance; //distances of trip 1, trip 2, and the total
        
        //printing the minutes and the tire rotations
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        
    
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance of trip 1 in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //changing the units to miles
        
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance of trip 2 in miles
        
        totalDistance=distanceTrip1+distanceTrip2; // add distances
        
        //print the all the distances!!
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");


    }       

}