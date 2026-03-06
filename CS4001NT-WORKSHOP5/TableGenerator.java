import java.util.Scanner;
public class TableGenerator
{
  public static void main(String[] args){    
      Scanner scanner = new Scanner(System.in);
      //while loop is made true to continue looping until users input end here.
      while(true){
      System.out.println("which number table do you want? or type (end) for exit");
      //.hasNext() is scanner method that takes input and checks if the token and work accordingly.
      if(scanner.hasNext("end")){
          System.out.println("for the multiplication table comeback again");
          break;
      }
      int number = scanner.nextInt();
      System.out.println("the multiplication table of " + number + " is shown below:");
      System.out.println("==============================");
      for(int i=1;i<=10;i++){
          int table = number * i;
          System.out.println(number + " * " + i + " = " + table);
      }
      System.out.println("==============================");
  
    }
      scanner.close();
}
}