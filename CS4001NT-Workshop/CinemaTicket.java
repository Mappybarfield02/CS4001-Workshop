import java.util.Scanner;
public class CinemaTicket
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age group");
        String ageGroup = sc.nextLine();
       
        //Declaration variables
        double basePrice = 0;
        
        switch(ageGroup){
            case "Child":
                basePrice = 150;
                System.out.println("baseprice for child " + basePrice);
                break;
            case "Adult":
                basePrice = 250;
                System.out.println("baseprice for adult " + basePrice);
                break;
            case "Senior":
                basePrice = 200;
                System.out.println("baseprice for senior " + basePrice);
                break;
            default:
                System.out.println("please enter your valid agegroup");
                break;
                    
        } 
        //checks the input whether it is match or not, if match it will proceed otherwise, execution will stop
        if(ageGroup.equals("Child") || ageGroup.equals("Senior") ||ageGroup.equals("Adult")){        
        System.out.println("enter movie language");
        String movieLanguage = sc.nextLine();
        
        switch(movieLanguage){
            case "Hindi":
                basePrice += 50;
                break;
            case "English":
                basePrice +=100;
                break;
            case "Nepali":
                basePrice += 0;
                break;
            default:
                System.out.println("please enter valid movie language");
                break;                 
        }
        if(movieLanguage.equals("Hindi") || movieLanguage.equals("English")||movieLanguage.equals("Nepali")){
        
        System.out.println("price including movieLanguage charge: " + basePrice);
        
        System.out.println("is there festival");
        String festival = sc.nextLine();
        
        //ternary operator
        double festivalDiscount = festival.equalsIgnoreCase("Yes") ? 0.15*basePrice : 0;
        System.out.println("festival discount: " + festivalDiscount);
        
        System.out.println("are you a student?");
        String isStudent = sc.nextLine();
        
        double studentDiscount = isStudent.equalsIgnoreCase("Yes") ? 0.20*basePrice : 0;
        System.out.println("Student discount: " + studentDiscount);
        
        double finalticketprice = basePrice-festivalDiscount-studentDiscount;
        System.out.println("final ticket price: " + finalticketprice);
        
    }
 else{
    System.out.println("invalid language");
}
}
    else {
        System.out.println("invalid ageGroup");
    }
        sc.close();
    }
}