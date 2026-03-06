import java.util.Scanner;
public class SellingPriceCalculator
{
  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the marked price");
      double mp = sc.nextDouble();
      
      System.out.println("enter the category");
      String category = sc.next();
      double discountPercent=0;
      switch(category){
          case "A":
             discountPercent= 60;
             break;
          case "B":
              discountPercent= 40;
              break;
          case "C":
              discountPercent= 20;
              break;
          case "D":
              discountPercent= 10;
              break;
          default:
              System.out.println("enter valid category");
      }
      
      //discount according to category
      double discountAmount = (discountPercent/100) * mp;
      
      //selling price formula
      double sp = mp - discountAmount;
      
      System.out.println("discount % =" + discountPercent);
      System.out.println("discount amount= " + discountAmount);
      System.out.println("selling price= " + sp);
      
      sc.close();
  }
}