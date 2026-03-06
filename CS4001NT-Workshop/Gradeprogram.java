import java.util.Scanner;
public class Gradeprogram
{
    String grade;
    double gpa;
    
 public static void main(String[] args){
     
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter your gpa");//asking user to input gpa
    double gpa = scanner.nextDouble();
    
    if(gpa<0.0 || gpa >4.0){
        System.out.println("Please enter valid gpa");
    }
    else if(gpa > 0 && gpa <1){
        System.out.println("Not graded.");
    }
    else if(gpa >=1 && gpa<=1.3){
        System.out.println("Your grade is D");
    }
    else if(gpa >1.3 && gpa <1.7){
        System.out.println("Your grade is D+");
    }
    else if(gpa >=1.7 && gpa <2.0){
        System.out.println("Your grade is C-");
    }
    else if(gpa >= 2.0 && gpa <2.3){
        System.out.println("Your grade is C");
    }
    else if(gpa >=2.3 && gpa <2.7){
        System.out.println("Your grade is C+");
    }
    else if(gpa >=2.7 && gpa <3.0){
        System.out.println("Your grade is B-");
    }
    else if(gpa >=3.0 && gpa <3.3){
        System.out.println("Your grade is B");
    }
    else if(gpa >=3.3 && gpa <3.7){
        System.out.println("Your grade is B+");
    }
    else if(gpa >=3.7 && gpa <4.0){
        System.out.println("Your grade is A-");
    }
    else {
        System.out.println("your grade is A+");
    }
    scanner.close();
 }
}