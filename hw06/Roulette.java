///////////////////////////////////////////////////////////////////////////////
/*
Jordan Hess
9/13/14
hw06 - program 1

goal:
roulette game. bet on every spin for 100 spins. 3 wins = a profit. simulate 1000
rounds of this. print out total earnings, number of times everything was lost, 
and number of times a profit was made.

status:  all done.

*/

import java.util.Scanner;

public class Roulette{
    public static void main(String arg []){
      
    int i = 0; //inner loop
    int n = 0; //outer loop
    int randomGuess = 0; //bet
    int randomAnswer = 0; //spin
    int wins = 0; //individual game wins
    int losses = 0; //individual game losses
    int gameWins = 0; //100 wins
    int gameLosses = 0; //100 losses
    int moneyMade = 0; //total money for all 1000 games
    boolean profitMade = false;
   
  
    while(n<1000){//100 games, 1000 times
   
        while(i<100){ //100 games
            randomGuess = (int)(Math.random()*38); //random bet
            randomAnswer = (int)(Math.random()*38); //random spin
           
            if (randomAnswer == randomGuess){ //if the bet and spin are the same
               wins++;
               moneyMade += 36;
            }
           
            if(wins >= 3){ //amount requierd to make money
               profitMade = true;
            }

            i++;
           
        }
       
       
        if (profitMade == true){ //profit made or note
            gameWins++;
        }
    
        if (wins == 0){ //when you lose everything
            gameLosses++;
        }
       
        n++;
    
        //reset everything
        i=0;
        wins = 0;
        losses = 0;
        profitMade = false;
       
       
       
    }
    //print everything
    System.out.println("you lost everything " + gameLosses + " times");
    System.out.println("your total winnings are $" + moneyMade);
    System.out.println("you made a profit " + gameWins + " times out of 1000");
          
  }
}