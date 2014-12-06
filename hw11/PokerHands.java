import java.util.Scanner;

public class PokerHands{
    
    public static void main(String[] args){
        
        int[] hand = new int[5];
        hand = generateHand();
        showOneHand(hand);
        calculateHand(hand);
        
    }
    
    public static int[] generateHand(){
        
        Scanner scan = new Scanner(System.in);
        int[] hand = new int[5];
        
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand ");
        String input = scan.next();
        if ((input.equals("y")) || (input.equals("Y"))){
            
            System.out.println("y has been entered");
            
            for (int i = 0; i < 5; i++){
                
                int overallNumber = 0; //the number 0-52
            
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
                
                String suit = scan.next();
                    
                //assign value to suit
                if ((suit.equals("c")) || (suit.equals("d")) || (suit.equals("h")) || (suit.equals("s"))){
                    
                    if(suit.equals("c")){
                        overallNumber += 0;
                    }
                    if(suit.equals("d")){
                        overallNumber += 13;
                    }
                    if(suit.equals("h")){
                        overallNumber += 26;
                    }
                    if(suit.equals("s")){
                        overallNumber += 39;
                    }
                    
                }
                else{
                    System.out.println("You did not enter a valid response");
                    generateHand();
                }
                 
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
                
                String card = scan.next();
                
                //convert string to int
                if (card.equals("a") || card.equals("k") || card.equals("q") || card.equals("j") || card.equals("10") || card.equals("9") || card.equals("8") || card.equals("7") || card.equals("6") || card.equals("5") || card.equals("4") || card.equals("3") || card.equals("2")){
                    
                    if(card.equals("a")){
                        overallNumber += 0;
                    }
                    if(card.equals("k")){
                        overallNumber += 1;
                    }
                    if(card.equals("q")){
                        overallNumber += 2;
                    }
                    if(card.equals("j")){
                        overallNumber += 3;
                    }
                    if(card.equals("10")){
                        overallNumber += 4;
                    }
                    if(card.equals("9")){
                        overallNumber += 5;
                    }
                    if(card.equals("8")){
                        overallNumber += 6;
                    }
                    if(card.equals("7")){
                        overallNumber += 7;
                    }
                    if(card.equals("6")){
                        overallNumber += 8;
                    }
                    if(card.equals("5")){
                        overallNumber += 9;
                    }
                    if(card.equals("4")){
                        overallNumber += 10;
                    }
                    if(card.equals("3")){
                        overallNumber += 11;
                    }
                    if(card.equals("2")){
                        overallNumber += 12;
                    }
                    
                } 
                else{
                    System.out.println("You did not enter a valid response");
                    generateHand();
                    
                    
                }
                
                
                hand[i] = overallNumber;
                    
                
            }
            
            
            
        }
        
        return hand;
        
        
        
    }
    
    
    public static void showOneHand(int hand[]){
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        
        String out = "";
        
        for (int s = 0; s < 4; s++){
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
    
    public static void calculateHand(int[] hand){
        
        int[] frequency = new int[13];
        int numberPairs = 0;
        int three = 0;
        int four = 0;
        boolean straight = false;
        boolean flush = false;
        
        int clubs = 0;
        int diamonds = 0;
        int hearts = 0;
        int spades = 0;
        
        //counting the number of cards in a suit
        for (int i = 0; i < hand.length; i++){
            
            int card = hand[i];

            
            if ((card >= 0) && (card < 13)){
                clubs++;
            }
            if ((card >= 13) && (card < 26)){
                diamonds++;
            }
            if ((card >= 26) && (card < 39)){
                hearts++;
            }
            if ((card >= 39) && (card < 52)){
                spades++;
            }
            
        }
        //for checking flush too
        if((clubs == 5) || (diamonds == 5) || (hearts == 5) || (spades == 5)){
                flush = true;
            }
        
        
        
        for (int i = 0; i < hand.length; i++){ //calculate the frequency of cards
            
            int card = hand[i];
            if (card > 12 && card < 26){
                card = card - 13;
            }
            if (card > 25 && card < 39){
                card = card - 26;
            }
            if (card > 38 && card < 52){
                card = card - 39;
            }
            
            frequency[card]++;
            
        }
        
        //for pairs:
        for (int i = 0; i < frequency.length; i++){
            
            if (frequency[i] == 2){
                numberPairs++;
            }
            if (frequency[i] == 3){
                three++;
            }
            if (frequency[i] == 4){
                four++;
            }

           // if ((frequency[i] == frequency[i+1]) && (frequency[i] == frequency[i+2]) && (frequency[i] == frequency[i+3]) && (frequency[i] == frequency[i+4])){
             //   straight = true;
            //}

        }
        
        //print the result;
        //pair
        //four of a kind
        if (four == 1){
            System.out.println("This is a four of a kind");
        }
        
        else if (flush == true){
            System.out.println("This is a flush");
        }
        else if (three == 1 && numberPairs == 1){
            System.out.println("This is a full house");
        }
        else if (straight == true){
            System.out.println("This is a straight");
        }
        else if (three == 1 && numberPairs == 0){
            System.out.println("This is a three of a kind");
        }
        else if (numberPairs == 2){
            System.out.println("This is a two pair");
        }

        else if (numberPairs == 1){
            System.out.println("This is a pair");
        }
        //two pair
        
        //three of a kind
        
        //straight
       
        
        //full house
        
        //flush
        
        
    
        
        
    }
}