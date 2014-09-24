//////////////////////////////////////////////////////////////////////
/*

Jordan Hess
9/20/14
hw04 - program 2

taking a month input and tell the number of days in that month
if the month is febuaray then ask the year and tell the days based
upon that

*/

import java.util.Scanner;

public class Month{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        //declaring variables 
        int month = 0;
        int year = 0;
        
        System.out.println("Enter a month(1-12)");
        
        if(myScanner.hasNextInt()){ //checking if its a int
        
            month = myScanner.nextInt(); // storing int
            
            if(month > 0 && month < 13){ //checking if greater than zero and less than 13
                if (month == 2){ //febuary exception 
                    System.out.println("Enter a year:");
                    year = myScanner.nextInt(); //taking year input
                    
                    if ((year % 4) == 0){ //determining year
                        System.out.println("29 Days"); //divisable by 4
                    }
                    
                    else{
                        System.out.println("28 Days"); //not divisable by 4
                    }
                }
                else{ // for not febuary 
                    
                    if ((month % 2) == 0){ // even months
                        System.out.println("30 Days");
                    }
                    else{ //odd months
                        System.out.println("31 Days");
                    }
                }
            }
            else{
            System.out.println("this is less than zero or it is greater than 12:("); //printing if error
            }
        }
        else{
            System.out.println("not an int :(");  //printing if error
        }
    }
}