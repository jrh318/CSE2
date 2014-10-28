///////////////////////////////////////////////////////////////////////////////
/*
Jordan Hess
10/28/14
hw08

goal:
write three methods that overload eachother

status:  all done.

*/


import java.util.Scanner;

public class HW8 {


    public static char getInput(Scanner scan, String letters){
        
        String input = scan.next();
        if (input.length() == 1){    //length check
            
            switch(input){ //possible cases
                
                case "c": 
                    return 'c';
                case "C":
                    return 'C';
                    
                default: //if the input is not c or C
                    System.out.println("You didn't enter a character from the list 'Cc'; try again:");
                    return getInput(scan, "Cc"); //trying again 
            }
        }
        
        else{ //if its more than one character
            System.out.println("You should enter exactly one character:");
            return getInput(scan, "Cc"); //trying again
        }
    }
    
    public static char getInput(Scanner scan, String letters, int number){
        
        String input = scan.next();
        
        if (number > 0){ //counter for 5 tries
        
            if (input.length() == 1){ //length check
                
                switch(input){ //check for yYnN
                    
                    case "y":
                        return 'y';
                    case "Y":
                        return 'Y';
                    case "n":
                        return 'n';
                    case "N":
                        return 'N';
                   
                    default: //if not yYnN
                        System.out.println("You did not enter a character from the list 'yYnN'; try again:");
                        return getInput(scan, "yYnN", number = number - 1); //increasing wrong counter and try again
                    
                }
            }
            
            else{ //more than one number
                System.out.println("You should enter exactly one character:");
                return getInput(scan, "yYnN", number = number - 1); //increasing wrong counter and try again
               
            }
        }
        
        else{ //failing after 5
            System.out.println("You failed after 5 tries :( ");
            return' ';
        }
        
    }
    
    public static char getInput(Scanner scan, String phrase, String numbers){
       
        System.out.println(phrase); //printing the phrase
        
        if (scan.hasNextInt()){ //check if int
            
            String input = scan.next(); //scanning for input
                
            switch(input){ //cases 0-9
            
                case "0":
                    return '0';
                case "1":
                    return '1';
                case "2":
                    return '2';
                case "3":
                    return '3';
                case "4":
                    return '4';
                case "5"
                    return '5';
                case "6":
                    return '6';
                case "7":
                    return '7';
                case "8":
                    return '8';
                case "9":
                    return '9';
                default: //out of range 
                    System.out.println("Your number is out of the range!");
                    return getInput(scan, "Choose a digit.", "0123456789"); //trying again 
                    
            }
            
        }
        
        else{ //not an int
        
            System.out.println("This is not a correct character");
            return getInput(scan, "Choose a digit.", "0123456789"); //trying again
        }
    }
    
    

    public static void main(String[] arg) {

        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");

    }
}