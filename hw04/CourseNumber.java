//////////////////////////////////////////////////////////////////////
/*

Jordan Hess
9/20/14
hw04 - program 3

take a 6 digit number and print out the year and the season
The first four digits give the year, and the last two digits 
give the semester: 10 spring, 20 summer 1, 30 summer 2, and 40 fall.

status: all done!

*/

import java.util.Scanner;

public class CourseNumber{
    
    public static void main(String[] args){
        
        Scanner myScanner; 
        myScanner = new Scanner(System.in); 
        
        String semester = "";
        
        System.out.println("Enter a code:"); //getting input
        int code = myScanner.nextInt();
        int semesterNumber = 0;
        int year = 0;
        
        
        if(code >= 186510 && code <= 201440){ //checking the range
        
            if((code%10) != 0){ //if the number is a multiple of ten
                
                semesterNumber = code%100; //storing the last two numbers
                System.out.println( semesterNumber + " is not a legit number :(");
            }
            
            else{
                
                semesterNumber = code%100; //storing last two numbers
                code = code/100; //removing last two numbers
                year = code; 
                
                //chaning number into string
                if (semesterNumber == 10){
                    semester = "Spring";
                }
                if (semesterNumber == 20){
                    semester = "Summer 1";
                }
                if (semesterNumber == 30){
                    semester = "Summer 2";
                }
                if (semesterNumber == 40){
                    semester = "Fall";
                }
                
                //checking range for semester
                if ((semesterNumber > 40)  || (semesterNumber < 10)){
                    System.out.println( semesterNumber + " is not a legit number :(");
                    return;
                }
                
                System.out.println("The course was offered in the " + semester + " semester of " + code);
            }
        }
        else{
            System.out.println("The number was outside the range [186510,201440]");
        }
        
    }
}