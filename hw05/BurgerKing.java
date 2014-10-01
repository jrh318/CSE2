/////////////////////////////////////////////////////////////////////
/*
Jordan Hess
9/30/14
hw05 program 1

burger king orders and such 

status: 


*/






import java.util.Scanner;
    
public class BurgerKing{
    
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //declare variables
        String mainChoice = "";
        String bChoice = "";
        String fChoice = "";
        String sChoice = "";
        String orderTotal = "";
        
        System.out.println("Enter a letter to indicate a choice ofEnter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Fries (F or f)");
        System.out.println("Soda (S or s)");
        
        mainChoice = myScanner.next();
        
        switch(mainChoice){
            
            //burgers
            case "b":
            case "B":
                mainChoice = "Burger";
                System.out.println("Enter A or a for all the fixins");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above c");
                bChoice = myScanner.next();
                
                //choices
                switch(bChoice){
                    case "A":
                    case "a": bChoice = " with all the fixins";
                        break;
                    case "C":
                    case "c": bChoice = " with cheese";
                        break;
                    case "N":
                    case "n": bChoice = " with none of the above";
                        break;
                    default: System.out.println("you didn't enter a, A, c, C, n, N");
                        break;
                }
                
                break;
                
            //fries
            case "F":
            case "f":
                mainChoice = "fries";
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
                fChoice = myScanner.next();
                
                //choices
                switch(fChoice){
                    case "L":
                    case "l": fChoice = " large ";
                        break;
                    case "S":
                    case "s": fChoice = " small ";
                        break;
                    default: System.out.println("you didn't enter l, L, s, S");
                        break;
                }
                
                break;
            
            //soda
            case "S":
            case "s":
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
                sChoice = myScanner.next();
                mainChoice = "";
                
                //choices
                switch(sChoice){
                    case "C":
                    case "c": sChoice = " coke";
                        break;
                    case "S":
                    case "s": sChoice = " sprite";
                        break;
                    case "M":
                    case "m": sChoice = " mt. dew";
                        break;
                    case "P":
                    case "p": sChoice = " pepsi";
                        break;
                    default: System.out.println("you didn't enter c, C, s, S, m, M, p, P");
                        break;
                }
                
                break;
                
                //error
                default: System.out.println("you didn't enter any of b, B, s, S, f, or F");
                    break;
        }
        
        //printing final answers
        System.out.println("you ordered a " + sChoice + fChoice + mainChoice + bChoice);
    }
}