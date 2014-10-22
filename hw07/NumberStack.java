///////////////////////////////////////////////////////////////////
/*
Jordan Hess
10/20
hw07

printing a pattern
   1
   -
  222
  222
  ---
 33333
 33333
 33333
 -----
4444444
4444444
4444444
4444444
-------

etc....

status: need to fix the spacing


*/

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] arg) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: ");
        int input = myScanner.nextInt();
        
        int numberofNumbers = 0;
        String dashLength = "-";
        String spacing =" ";
        int spacingAmount = (input-1);

        
        
        //System.out.println(input);
        
        
        /////////////FOR LOOP//////////////
        
        for(int i = 1; i <= input; i++){ // each number
            
            for(int j = 1; j <= i; j++){//for lines in individual number group
                
                
                for(int l = (input - i); l > 0; l--){ //spacing
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
            
            System.out.println(dashLength);
            dashLength = dashLength + "--"; //add two more dashes
            numberofNumbers += 2; //add two more numbers per line
        
            spacingAmount--;
            
            
        }
        //////////////////////////////////////////////////////////
        
        //resetting everything
        numberofNumbers = 0;
        spacingAmount = (input-1);
        dashLength = "-";
        spacing =" ";
        
        //////////////WHILE LOOP///////////////
        
        int i = 1;
        while(i <= input){    // each number
            
            
            int j = 1;
            while(j <= i){//for lines in individual number group
                
                
                int l = (input - i);
                while(l > 0){ //spacing
                    System.out.print(spacing);
                    //spacingAmount++;
                    l--;
                }
                
                int k = 1;
                while(k <= numberofNumbers){//for amount of numbers in a line
                    
                    System.out.print(i);
                    k++;
                }
                
                System.out.println(i);
                j++;
            }
            
            int m = spacingAmount;
            while(m > 0){
                System.out.print(" ");
                m--;
            }
            
            System.out.println(dashLength);
            dashLength = dashLength + "--"; //add two more dashes
            numberofNumbers += 2; //add two more numbers per line
        
            spacingAmount--;
            
            i++;
        
        }
        
        
        
        ///////////////////////////////////////////////////////
                //resetting everything
        numberofNumbers = 0;
        spacingAmount = (input-1);
        dashLength = "-";
        spacing =" ";
        
        //////////////DO WHILE LOOP///////////////
        
        i = 1;
        do{    // each number
            
            
            int j = 1;
            do{//for lines in individual number group
                
                
                int l = (input - i);
                do{ //spacing
                    System.out.print(spacing);
                    //spacingAmount++;
                    l--;
                }while(l > 0);
                
                int k = 1;
                do{//for amount of numbers in a line
                    
                    System.out.print(i);
                    k++;
                }while(k <= numberofNumbers);
                
                System.out.println(i);
                j++;
            }while(j <= i);
            
            int m = spacingAmount;
            do{
                System.out.print(" ");
                m--;
            }while(m > 0);
            
            System.out.println(dashLength);
            dashLength = dashLength + "--"; //add two more dashes
            numberofNumbers += 2; //add two more numbers per line
        
            spacingAmount--;
            
            i++;
            
            
        }while(i <= input);
        
        
        
        

    }
}