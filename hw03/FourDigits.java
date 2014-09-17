/*
Jordan Hess
9/13/14
hw03 - program 3
goal: Write a program that prompts the user to enter a double and 
then prints out the first four digits to the right of the decimal point.


status: kinda done...
*/
import java.util.Scanner;

public class FourDigits{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        
        System.out.println("Enter a double"); //getting input
        double x = myScanner.nextDouble();
        
        int y = (int)(x*10000); // multiplying * 10000
        
        //ones digit
        int x1 = y%10;
        y = y/10;
        
        //twos digit
        int x2 = y%10;
        y = y/10; 

        //threes digit
        int x3 = y%10;
        y = y/10; 

        //fours digit
        int x4 = y%10;
        y = y/10; 
        
        
        
        
        System.out.println("The four digits to the right of the decimal point are: " + x4 + x3 + x2 + x1);

        
    }
    
}