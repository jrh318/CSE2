///////////////////////////////////////////////////////////////////////////////
/*
Jordan Hess
9/13/14
hw06 - program 1

goal:
find the square root of a number

status:  all done.

*/


import java.util.Scanner;


public class Root{
  public static void main(String arg []){
      
      
      
      //scanner
      Scanner myScanner; 
      myScanner = new Scanner(System.in);
      
      
      System.out.println("enter a number: ");
      double input = myScanner.nextInt();
      
      double high = 0;
      double low = 0;
      double middle = 0;
      double middleSquared = 0;
      int test = 0;
      
      high = 1+input;
      
        while ((high-low)>(0.0000001*(1+input))){
        
          middle = ((low+high)/2);
          
          middleSquared = middle*middle;
          
          if ((middleSquared) > input){
            high = middle;
          }
          else{
            low = middle;
          }
        
        
        }
        
        middle = middle*100;
        middle = (int) middle;
        middle = middle/100;
      
      
      
           
      
      System.out.println("the square root is: " + middle);
      
  }
}