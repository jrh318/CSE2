///////////////
/*

jordan hess
hw10



*/


import java.util.Scanner;

public class FindDuplicates{
    
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] list) {

      boolean isTrue = false;

      for (int i = list[0]; i < list.length; i++) {
        

          for (int k = list[0]; k < list.length; k++) {
            
            
              if (k == i){
                continue;
              }

              if (list[i] == list[k]) {
                  isTrue = true;
              }

          }
      }

      if (isTrue == true) {
          return true;
      }
      else {
          return false;
      }

  }
    public static boolean exactlyOneDup(int[] list) {

      boolean isTrue = false;
      int counter = 0;

      for (int i = list[0]; i < list.length; i++) {

          for (int k = list[0]; k < list.length; k++) {

              if (k == i){
                continue;
              }
              
              if (list[k] == list[i]) {
                  isTrue = true;
                  counter++;
                  //System.out.println(counter);

              }

          }
      }

      if (isTrue == true && counter == 2) {
          //System.out.println("true");
          return true;
        

      }
      else {
         // System.out.println("false");
          return false;
          
      }

  }
  
  
  
}
