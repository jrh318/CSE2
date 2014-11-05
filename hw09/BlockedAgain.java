///////////////////////////////////////////////////////////////////
/*

Jordan Hess
11/4/14
hw09

redo hw07 with methods that break up the work in order to create a 
modular program.

status - all done

*/


import java.util.Scanner;

public class BlockedAgain{
    
    public static void main(String []s){ // main method
        
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);

    
    }
    
    public static int getInt(){ // get the input from the user
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an int 1-9: ");
        
        int input = checkRange(scan);
        
        return input;
        
        
    
    }
    
    public static int checkInt(Scanner input){ //check if it is an int, called in checkRange

       int x;
       
       while (!(input.hasNextInt())){
           System.out.println("you didn't enter an int");
           input.next();
       }
       
       x = input.nextInt();
       return x;
        
    }
    
    public static int checkRange(Scanner scan){ //the first method called to check if its within the range, then calls checkInt
        
        int input = checkInt(scan);
        
        while (!((input<10) && (input>0))){ //if its not in the range keep doing this
            System.out.println("this number isn't within the range 1-9");
            input = checkInt(scan); //re call method 
        }
        
        return input; //if its good
    
    }
    
    public static void allBlocks(int x){ //call the block method, basially compiling it all
        block (x);
    }
    
    
    public static void block(int number){ //groups of numbers
        int numberofNumbers = 0;
        String dashLength = "-";
        String spacing =" ";
        int spacingAmount = (number-1);
        
        for(int i = 1; i <= number; i++){
            line(number, i, dashLength, spacing, numberofNumbers, spacingAmount);
            
            System.out.println(dashLength);
            dashLength = dashLength + "--"; //add two more dashes
            numberofNumbers += 2; //add two more numbers per line
            spacingAmount--;
            
        }
    }
    
    public static void line(int number, int i, String dashLength, String spacing, int numberofNumbers, int spacingAmount){ //individual lines
        //indivudal lines

        
        for(int j = 1; j <= i; j++){//for lines in individual number group
                
                
                for(int l = (number - i); l > 0; l--){ //spacing
                    System.out.print(spacing);
                    //spacingAmount++;
                }
                
                for (int k = 1; k <= numberofNumbers; k++){//for amount of numbers in a line
                    
                    System.out.print(i);
                }
                
                System.out.println(i);

            }
            
            for (int m = spacingAmount; m > 0; m--){
                System.out.print(" ");
            }
            
            
            
        
    } 
}