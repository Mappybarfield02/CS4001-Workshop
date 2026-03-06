import java.util.Scanner;
public class Routine
{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the day:");
     String routine = sc.nextLine();
     //switch conditional control statement
     switch(routine){
         case "Sunday":
             System.out.println("IS 8:00 - 9:30");
             break;
         case "Monday":
             System.out.println("programming 9:30 - 11:00");
             break;
         case "Tuesday":
             System.out.println("computer hardware 12:00 - 1:30");
             break;
         case "Wednesday":
             System.out.println("software 1:30 - 2:30");
             break;
         case "Thursday":
             System.out.println("computing 2:40 - 4:00");
             break;
         case "Friday":
             System.out.println("cloud 6:00 - 7:30");
             break;
         case "Saturday":
             System.out.println("AWS 9:00 - 10:00");
             break;
         default:
             System.out.println("Please enter valid day!");
             //this will be display if user dont enter the correct day
         
     }
     sc.close();
 }
}