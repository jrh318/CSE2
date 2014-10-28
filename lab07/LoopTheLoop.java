import java.util.Scanner;


public class LoopTheLoop{
  public static void main(String arg []){
    
    int nStar = -1;
    int i = 0; //second loop
    int m = 0; //nested loop
    int n = 0; //first loop
    
    
    Scanner myScanner; 
    myScanner = new Scanner(System.in);
    
    while(true){
      
      System.out.println("enter and int between 1 and 15-");
      
      
        
        if(myScanner.hasNextInt()){
          
          nStar = myScanner.nextInt();
        
          if(nStar>0 && nStar<16){
          
          while (n<nStar){
            System.out.print("*");
            n++;
          }
          
          System.out.println(""); //add a space between the two loops
          
          while (i<nStar){
              
              while(m<i){
                  m++;
                  System.out.print("*");
                  
              }
              
              m=0;
              System.out.println("*");
              i++;
              
              
              
              
            
          }
        }
        else{
          System.out.println("this number is out of range");
        }
      }
      else{
        System.out.println("this is not an int");
      }
      i=0;
      m=0;
      n=0;
    }
    
  }
}
