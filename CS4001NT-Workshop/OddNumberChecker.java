import java.util.Scanner;
public class OddNumberChecker
{
  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      
      //use of modulo operator
      if(input % 2==0){
          System.out.println("your number is even");
      }
      else{
          System.out.println("your number is odd");
      }
      sc.close();
  }
}