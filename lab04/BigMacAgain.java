//////////////////////////////////////////////////////////////// 
/*

Write a program that uses the Scanner class to obtain from users
how many Big Macs they want and whether they want an order of fries.
It then prints out the total cost of the meal.

jordan hess
9/17/14
lab04

*/

import java.util.Scanner;

public class BigMacAgain{
    
    public static void main(String[] args){
        
        Scanner myScanner; 
        myScanner = new Scanner( System.in );
        
        
        
        
        System.out.println("Enter number of big macs:");
        int x = myScanner.nextInt();
        
        if(myScanner.hasNextInt() == true){
        //if(x>1){
            
            System.out.println("You ordered " + System.in + " big macs");
            
            
            
        } else{
                System.out.println("You did not enter an int");
                return;    //leaves the program, i.e.
                          //the program terminates
            }
            
        

        
    }
}