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

        //if (scan.hasNextInt()){ //check if int
            
                String input = scan.next(); //scanning for input
                
                if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9")){
                    return input.charAt(0);
                }
                
                else{
                    System.out.println("This is not an acceptable character");
                    return getInput(scan, "Choose a digit.", "0123456789");
                }
            
        //}
        
       /* else{ //not an int
        
            System.out.println("This is not a correct character");
            return getInput(scan, "Choose a digit.", "0123456789"); //trying again
        }
        */
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