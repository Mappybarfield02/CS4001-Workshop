import java.util.Scanner;
public class PositveNegativeZero
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        
        if(num>0){
            System.out.println("your num is positive");
        }
        else if(num<0){
            System.out.println("your num is negative");
        }
        else{
            System.out.println("your num is zero");
        }
        sc.close();
    }
}