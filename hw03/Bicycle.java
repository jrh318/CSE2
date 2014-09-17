/*
Jordan Hess
9/13/14
hw03 - program 1

goal:
take inputs of counts and seconds and 
convert to distance, time, and mph

status: all done



*/
import java.util.Scanner;

public class Bicycle{
    
    public static void main(String[] args){
        
        
        double wheelDiameter=27.0; //size of the wheel
        double PI=3.14159; //pie, yum
        int feetPerMile=5280; //feet in a mile
        int inchesPerFoot=12; // inches in a foot
        int minutesPerHour=60; // minutes in hour
        int secondsPerMinute=60; // seconds in minute
        double totalDistance; //distances of trip 
        double time; //time for the trip in minutes
        double mph; //speed
        
        //scanner
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        //getting inputs
        System.out.println("Enter number of counts:");
        int countsTrip = myScanner.nextInt();
        
        System.out.println("Enter number of seconds:");
        int secsTrip = myScanner.nextInt();
        
        //calculations 
        totalDistance=countsTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile;//converting to distance in miles
        time=secsTrip/secondsPerMinute; //converting seconds to minutes
        
        mph=totalDistance/(time/minutesPerHour); //calculating mph
        
        
        //rounding it to 2 decimal places
        totalDistance = totalDistance*100;
        totalDistance = (int)(totalDistance);
        totalDistance = totalDistance/100;
        
        //rounding it to 2 decimal places
        mph = mph*100;
        mph = (int)(mph);
        mph = mph/100;
        
        //printing
        System.out.println("your trip was " + totalDistance + " miles,");
        
        System.out.println("it took " + time + " minutes,");
        
        System.out.println("and you went at a speed of " + mph + " mph");
        
        
        
        
        
    }
    
}

