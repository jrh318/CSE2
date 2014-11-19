///////////////
/*

jordan hess
hw10



*/



import java.util.Random;
import java.util.Scanner;

public class PokerOdds{

    public static void main(String[] arg) {
        
        showHands();
        simulateOdds();

    }

    public static int[] showHands() {


        int[] deck = new int[52];
        int[] hand = new int[5];
        int randomNumber = 0;
        String clubs = "";
        String diamonds = "";
        String hearts = "";
        String spades = "";
        String labels[] = {"a ","k ","q ","j ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 ","a ","k ","q ","j ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 ","a ","k ","q ","j ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 ","a ","k ","q ","j ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};

        for (int i = 0; i < deck.length; i++) { //making the deck

            deck[i] = i;

        }

        for (int k = 0; k < 4; k++) { //making all the hand equal to -1

            hand[k] = -1;

        }

        for (int j = 0; j < 5; j++) { //choosing a card from the deck and putting into hand

            int cardNumber = 0;
            randomNumber = (int)(Math.random() * 52);

            hand[j] = deck[randomNumber];
            


            
            for (int i = randomNumber; i < 52; i++) {


               if (deck[i] < 51) {
                    
                    deck[i] = deck[i + 1]; //moving everything down
                }

            } 

        }
        
        /////////////////////////sorting the suits
        
        for (int k = 0; k < hand.length; k++){
            
            //System.out.println(labels[hand[k]]);
            
            
            
            if (hand[k] >= 0 && hand[k] < 13){
                clubs = clubs + labels[hand[k]];
            }
            if (hand[k] >= 13 && hand[k] < 26){
                diamonds = diamonds + labels[hand[k]];
            }
            if (hand[k] >= 26 && hand[k] < 39){
                hearts = hearts + labels[hand[k]];
            }
            if (hand[k] >= 39 && hand[k] < 52){
                spades = spades + labels[hand[k]];
            }
            
            
        }
        
        //individual suits
        System.out.println("clubs: " + clubs);
        System.out.println("diamonds: " + diamonds);
        System.out.println("hearts: " + hearts);
        System.out.println("spades: " + spades);
    
        
        
        return hand;


    }
    
    public static void simulateOdds() {
        
        
        int[] finalCards = new int[13];
        int noMatches = 0;
        boolean noMatchesTrue = false;
        
        for (int k = 0; k <13; k++){ //final cards to be displayed
            finalCards[k] = 0;
        }

        
        for (int i = 0; i < 10000; i++) { //10000 simulations
            

            
            int[] hand = showHands();

            for (int t = 0; t < hand.length; t++) {
                
                for (int z = t; z < hand.length; z++) {
                    
                    if ((hand[z]%13 == hand[t]%13) && (z != t)){ //getting pairs
                        
                        finalCards[hand[t]%13]++;
        
                    }
                    
                }

            }

        }
        
        //printing the results
        
        System.out.println("number of pairs after 10000 hands: ");
        
        for (int n = 0; n <13; n++){
            
            if (n>=0 && n < 10){
                System.out.println(n +": " + finalCards[n]);
                noMatches += finalCards[n];
            }
            
            if (n == 12){
                System.out.println("a " + finalCards[12]);
                noMatches += finalCards[n];

            }
            if (n == 11){
                System.out.println("k " + finalCards[11]);
                noMatches += finalCards[n];
            }
            if (n == 10){
                System.out.println("q " + finalCards[10]);
                noMatches += finalCards[n];
            }
            if (n == 9){
                System.out.println("j " + finalCards[9]);
                noMatches += finalCards[n];
            }

            
        }
        
        System.out.println("no matches: " + (10000 - noMatches));
        
    }

}
