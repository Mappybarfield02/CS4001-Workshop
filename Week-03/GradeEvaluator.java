//importing scanner class for user input
import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[] args){
        
    // to read input from the keyboard, creating a scanner object
    Scanner sc = new Scanner(System.in);
        
    //ask the user to enter the grade
    System.out.println("Enter the grade");
    //read grade as decimal number
    double grade = sc.nextDouble();
        
    //using ternary operator to evaluate pass or fail
    String Result = (grade >=40) ? "pass" : "fail";
    System.out.println("Result: " + Result);
        
    //close the scanner to free system resources
    sc.close();
    }
}