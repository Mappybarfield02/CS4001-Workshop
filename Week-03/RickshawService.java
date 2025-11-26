//importing Scanner class from java.util package
import java.util.Scanner;

public class RickshawService
{
    //main method initialization
   public static void main(String[] args){
       
   //creating object sc with class scanner
   Scanner sc = new Scanner(System.in);
   
   //taking distance input
   System.out.println("Enter the distance");
   double distance = sc.nextDouble();
   
   //taking time input
   System.out.println("Enter the time");
   double time = sc.nextDouble();
   
   // asking if the customer is local
   System.out.println("Is the customer local ? (yes/no)");
   String isLocal = sc.next();
   
   // asking if the travel is during night
   System.out.println("Is the customer travel for night ? (yes/no)");
   String isNight = sc.next();
   
   //declaring basefare and per unit charges
   double baseFare = 100;
   double perKilometer = 20*distance;
   double perMinute = 5 * time;
   
   //calculating basetotal before discounting or surcharging
   double basetotal = baseFare+perKilometer+perMinute;
   
   //charge of customer discounting 5% if he/she is local and distance travel is more than 10km)
   double localdiscount = (isLocal.equals("yes") && distance >10) ?(basetotal * 5/100) : 0.0;
   
   // charge of customer adding 5% who travels during night
   double nightsurcharge = (isNight.equals("yes"))? (basetotal *5/100): 0.0;
   
   //final fare calculation:
   double finaltotal = basetotal-localdiscount+nightsurcharge;
    
   //final fare output
   System.out.println("final fare: Rs. " + finaltotal);
   
   sc.close();
}
}

