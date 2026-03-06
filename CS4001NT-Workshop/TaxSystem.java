import java.util.Scanner;
public class TaxSystem
{
    double tax;
    double taxpayable;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your annual income");
        // it takes annual income in double
        double AnnualIncome = sc.nextDouble();
        
        if(AnnualIncome<=0){
            System.out.println("invalid number"); //it shows invalid if you put zero or below zero
        }
        else if(AnnualIncome>0 && AnnualIncome<=500000){
            double tax = 1; //tax rate
            double incometax = (tax/100) * AnnualIncome;
            System.out.println("your tax amount for " + incometax);
        }
        else if(AnnualIncome>500000 && AnnualIncome<=700000){
            double tax =10;
            //need to subtract 500000 here because its tax is added already and only the rest of income,tax is calculated
            double incometax = 5000 + (tax/100) * (AnnualIncome-500000);
            System.out.println("your tax amount for " + incometax);
        }
        else if (AnnualIncome>700000 && AnnualIncome<=1000000){
            double tax = 20;
            double incometax = 15000 + (tax/100) * (AnnualIncome-700000);
            System.out.println("your tax amount for " + incometax);
        }
        else if (AnnualIncome>1000000 && AnnualIncome<=2000000){
            double tax = 30;
            double incometax = 35000 + (tax/100) * (AnnualIncome-1000000);
            System.out.println("your tax amount for " + incometax);
        }
        else if (AnnualIncome>2000000 && AnnualIncome<=5000000){
            double tax = 36;
            double incometax = 335000 + (tax/100) * (AnnualIncome-2000000);
            System.out.println("your tax amount for " + incometax);
        }
        else{
            double tax = 39;
            double incometax = 1135000 + (tax/100) * (AnnualIncome-5000000);
            System.out.println("your tax amount for " + incometax);
        }
    sc.close();
    }
}