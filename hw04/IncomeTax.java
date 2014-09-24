//////////////////////////////////////////////////////////////////////
/*

Jordan Hess
9/20/14
hw04 - program 1

Write a program that prompts the user to enter an int that gives 
the thousands of dollars of income and then writes out the amount 
of tax on the income, given the following (progressive) schedule:

<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

status: all done!fuck yes
*/


import java.util.Scanner;

public class IncomeTax{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declaring an instance of the Scanner object
        myScanner = new Scanner(System.in); //construct an instance of the scanner class we declared
        
        
        //declaring variables 
        int taxRate = 0;
        double taxValue = 0;
        int income = 0;
        

        //taking input 
        System.out.println("Enter income in thousands:");
        
        
        if(myScanner.hasNextInt()){ // this doesnt work... its wants a second input to evaluate
        
            income = myScanner.nextInt();
            income = income*1000;
            
            if(income > 0){ //checking if income is a postive numver
                
                if (income < 20000){ // checking braket
                    taxValue = income*.05; // multiplying by tax rate
                    taxRate = 5; //setting taxRate value
                    
                }
                else if (income >= 20000 && income < 40000){
                    taxValue = income*.07;
                    taxRate = 7;
                }
                
                else if (income >= 40000 && income < 78000){
                    taxValue = income*.12;
                    taxRate = 12;
                }
                
                else if (income >= 78000){
                    taxValue = income*.14;
                    taxRate = 14;
                }
                
                //rounding
                taxValue = taxValue*100;
                taxValue = (int)(taxValue);
                taxValue = taxValue/100;
                
                //printing it all out
                System.out.println("The tax rate on $ " + income + " is " + taxRate + "% and the tax is $" + taxValue);
                
                
            }
            else{
                System.out.println("This number is negative :(");
            }
        }
        else{
            System.out.println("This number is not an int :(");
        
        }
        

    
    }
}