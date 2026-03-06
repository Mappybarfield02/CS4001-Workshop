import java.util.Scanner;
public class FixedDepositNIB
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while(b==true){
        System.out.println("Enter the amount for fixed deposit");
        double principal = scanner.nextDouble();
        System.out.println("Enter the time duration (1-5)");
        double time = scanner.nextDouble();
        System.out.println("Enter the rate (8-12)");
        double rate = scanner.nextDouble();
        
        if(principal>=1000 && rate>=8 && rate<=12 && time>0 && time<=5){
            //Math.pow is used here which is method of math class.
            //method is block of code which executes when it is called.
            double compoundInterest = principal*Math.pow(1+(rate/100)/12,12*time);
            //formula to calculate compound interest
            double charge = principal*0.5/100;
            double interestEarned = compoundInterest - principal;
            double finalAmount = compoundInterest-charge; //fixed deposit return
            System.out.println("You can earn interest rate: " + interestEarned); 
            System.out.println("your final amount after " + time + " years is " + finalAmount); 
        }
        else{
            System.out.println("Error: Principal ≥1000, Rate 8–12%, Time Duration 1–5 years.");
        }
        System.out.println("do you want to continue? (yes/no)");
        String decision = scanner.next();
        if(decision.equals("yes")){
            b = true;
        }
        else{
            b = false;
            System.out.println("Thank you, Comeback again for FD calculation");
            break;
        }
}
scanner.close();
}
}