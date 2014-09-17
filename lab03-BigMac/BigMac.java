/* Jordan Hess
9/12/14
Lab 3, Arithmetic calculations and input

Goal: create a program that computes cost of buying a big mac

*/

import java.util.Scanner; //importing the scanner

public class BigMac{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        //number of BigMacs
        System.out.println("Enter the number of Big Macs (an integer > 0): "); //asking for input 
        int nBigMacs = myScanner.nextInt(); //storing input in nBigMacs
        
        //cost of BigMacs
        System.out.println("Enter the cost per Big Mac as” + “ a double (in the form xx.xx); "); //asking for input
        double bigMac$ = myScanner.nextDouble(); //storing input in bigMac#
        
        //tax
        System.out.println("Enter the percent tax as a whole number (xx): "); //asking for input
        double taxRate = myScanner.nextDouble(); //storing input in taxRate
        taxRate/=100; //converting percent to proportion 
        
        //print the output
        
        double cost$;
        int dollars,   //whole dollars
            dimes, pennies; //for storing digits
                //to the right of the decimal point 
                 //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount dropping decimal fraction
        dollars=(int)cost$;
        
        
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        
        //final priting
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $" +bigMac$+" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+"."+dimes+pennies);

        
        
        
        
    }
}
