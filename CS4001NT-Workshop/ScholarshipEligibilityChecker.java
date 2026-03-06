import java.util.Scanner;
public class ScholarshipEligibilityChecker{
 //declared variable/instance variable
    double gpa;
    int attendance;
    int attitude_score;

 public static void main(String[] args){
    //creating object 
    Scanner scanner = new Scanner(System.in);
    
    //asking the user to input gpa
    System.out.println("enter the gpa");
    //it takes double value
    double gpa = scanner.nextDouble(); 
     
    //checking condition if gpa is entered valid or not
    if(gpa <0 || gpa >4){
           System.out.println("you have entered invalid gpa");
      }
      // only runs when gpa is greater than 3.2
      else if(gpa>3.2){
        System.out.println("plese enter your attendance in between 1 to 100");
        // it takes attendance in int
        int attendance = scanner.nextInt();
        //nested if use
        if(attendance<0 || attendance >100){
            System.out.println("please enter correct attendance");
        } else if(attendance>=80){
            System.out.println("please enter your attitude score");
            int attitude_score = scanner.nextInt();
            if(attitude_score <0 || attitude_score >10){
                System.out.println("please enter correct attitude score");
            } else if(attitude_score<5){
                System.out.println("you are eligible for scholarship.");
            } else{System.out.println("Sorry, you are not eligible.");
        }//if attitude score is greater than 5, then this block will execute
        }
        else{
            System.out.println("Sorry, you are not eligible this year.");
        }// if attendance is not greater eqaul to 80 then it will execute this block
    } else{
        System.out.println("your gpa doesnt meet scholarship requirements.");
     }//if gpa is not 3.2 then it will execute this block and exit
     scanner.close();
    }
    }    
    