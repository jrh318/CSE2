///////////////////////////////////////////////////////////////////////////////
/*
Jordan Hess
9/26/14
Lab04

Goal:
Get input of either R,r,C,c,P,p (if not one then report and error)
If r,R is entered then play rolutte
if c,C is entered then play craps
if p,P is entered then play draw a random card





*/


import java.util.Scanner;

public class RandomGames{
    
    public static void main(String[] args){
        
        Scanner myScanner; 
        myScanner = new Scanner(System.in);
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String gameInput =myScanner.next();
            
//System.out.println(gameInput);
        
        
        switch(gameInput){
            
            case 1: gameInput = "r";
                int rolutte =(int)(Math.random()*38)+1;
                System.out.println(rolutte);
            case 2: gameInput = "c";
                System.out.println("craps");
                
            
        }
        
        
        
        
        
    
        
        
        /*
        if (gameInput.equals("r")){
            System.out.print("Roulette: ");
            
            int rolutte =(int)(Math.random()*38)+1;
            
            switch(rolutte){
                
                case 1: rolutte = 38;
                    System.out.println("00");
                    break;
                
                case 2:
                    System.out.println(rolutte);
                
                
            }
            
            
        }
        */
        
    }
}