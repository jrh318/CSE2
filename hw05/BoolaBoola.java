/////////////////////////////////////////////////////////////////////
/*
Jordan Hess
9/29/14
hw05 program 2

Make a game that prompts the player with three booleans and 
two comparisons and asks the answer. 

status: all done



*/

import java.util.Scanner;
    
public class BoolaBoola{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //declare variables
        boolean bool1;
        boolean bool2;
        boolean bool3;
        boolean bool12 = false;
        boolean boolFinal = false;
        int randomN;
        int randomN2;
        String input = " ";
        String comp1 = " ";
        String comp2 = " ";
        
        //random bool
       bool1 = (((int)(Math.random()*2)) == 0);
       bool2 = (((int)(Math.random()*2)) == 0);
       bool3 = (((int)(Math.random()*2)) == 0);

       //random ints for determining && and || 
       randomN = (int)(Math.random()*2);
       randomN2 = (int)(Math.random()*2);
       
       
       //comparing the first two booleans
       switch(randomN){
            case 0: //setting it as OR
               bool12 = (bool1 && bool2);
               comp1 = "and";
               break;
            case 1: //setting it as an AND
               bool12 = (bool1 || bool2);
               comp1 = "or";
               break;

       }
       
       //comparing the answer to the first two with the third
       switch(randomN2){
            case 0: //setting it as an AND
                boolFinal = (bool12 && bool3);
                comp2 = "and";
                switch (comp1){ //compiling the first and second comparisons
                    case "or": 
                       System.out.println("Does " + bool1 + " || " + bool2 + " && " + bool3 + " have the value true(t/T) or false(f/F)?");
                       input = myScanner.next();
                       break;
                    case "and":
                       System.out.println("Does " + bool1 + " && " + bool2 + " && " + bool3 + " have the value true(t/T) or false(f/F)?");
                       input = myScanner.next();
                       break;
                }
               
               break;
            case 1: //setting it as an OR
                boolFinal = (bool12 || bool3);
                comp2 = "or";
                switch (comp1){ //compiling the first and second comparisons
                    case "or":
                       System.out.println("Does " + bool1 + " || " + bool2 + " || "+ bool3 + " have the value true(t/T) or false(f/F)?");
                       input = myScanner.next();
                       break;
                    case "and":
                       System.out.println("Does " + bool1 + " && " + bool2 + " || " + bool3 + " have the value true(t/T) or false(f/F)?");
                       input = myScanner.next();
                       break;
                }
                    
                break;
    
       }
       
       //checking if the input is correct
       switch(input){
            case "t": //true
               if (boolFinal == true){
                   System.out.println("Correct!");
               }
               else{
                   System.out.println("Wrong, try again");
               }
               
               break;
            case "T": //true
               if (boolFinal == true){
                   System.out.println("Correct!");
               }
               else{
                   System.out.println("Wrong, try again");
               }
               
               break;
            case "f": //false
               if (boolFinal == false){
                   System.out.println("Correct!");
               }
               else{
                   System.out.println("Wrong, try again");
               }
               
               break;
            case "F": //false
               if (boolFinal == false){
                   System.out.println("Correct!");
               }
               else{
                   System.out.println("Wrong, try again");
               }
               
               break;
            default: 
                System.out.println("you entered a wrong letter :( ");
                break;
       }
        

    }
}