/*
Jordan Hess
9/13/14
hw02 - program 2
cube root

status: all done
:)

*/ 

import java.util.Scanner;

public class Root{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        
        //taking input
        System.out.println("Enter a value for x:");
        double x = myScanner.nextDouble();
        
        
        //calculating the guesses for the cube root
        double xGuess1 = x/3;
        double xGuess2 = (2*xGuess1*xGuess1*xGuess1+x)/(3*xGuess1*xGuess1);
        double xGuess3 = (2*xGuess2*xGuess2*xGuess2+x)/(3*xGuess2*xGuess2);
        double xGuess4 = (2*xGuess3*xGuess3*xGuess3+x)/(3*xGuess3*xGuess3);
        double xGuess5 = (2*xGuess4*xGuess4*xGuess4+x)/(3*xGuess4*xGuess4);
        double answer = (2*xGuess5*xGuess5*xGuess5+x)/(3*xGuess5*xGuess5);

        
        //cubing the cube root
        double xGuess5Cubed = answer*answer*answer;
        
        //print everything out
        System.out.println("Guess for the cube root " + answer);
        
        System.out.println("Guess 1 cubed is: " + xGuess5Cubed);

        
        
    }
}