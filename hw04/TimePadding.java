//////////////////////////////////////////////////////////////////////
/*

Jordan Hess
9/21/14
hw04 - program 4

convert seconds into time of day

status: all done

*/


import java.util.Scanner;

public class TimePadding{
    
    public static void main(String[] args){
        
        
        Scanner myScanner; 
        myScanner = new Scanner(System.in);
        
        
        System.out.println("Enter a number of seconds");
        
        if(myScanner.hasNextInt()){ //checking if its a int
            
            
            int enteredSeconds = myScanner.nextInt(); // storing int
            
            //seconds       
            int seconds = enteredSeconds%60;
            String secondsZeros = "";
            
            //padding with zeros
            if (seconds < 10){
                secondsZeros = "0";
            }
            if (seconds == 0){
                secondsZeros = "00";
            }
            
            //converting to minutes
            int totalMinutes = ((enteredSeconds - seconds)/60);
            int minutes = totalMinutes%60;
            String minutesZeros = "";
            
            //padding with zeros
            if(minutes < 10){
                minutesZeros = "0";
            }
            if(minutes == 0){
                minutesZeros = "00";
            }
            
            //hours
            int hours = totalMinutes/60;
            
            //printings
            System.out.println(hours + ":" + minutesZeros + minutes + ":" + secondsZeros + seconds);
            
        }
        
        else{ //if it isnt an int
            System.out.println("this is not an int");
        }
        
    }
}