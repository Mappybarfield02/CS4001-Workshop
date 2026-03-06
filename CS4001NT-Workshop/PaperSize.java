import java.util.Scanner;
public class PaperSize
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paper size");
        String papersize = sc.nextLine();
        
        switch(papersize){
            case "A0":
                System.out.println("A0: 841 * 1189 mm(33.1 * 46.8 inches)");
                break;
                
            case "A1":
                System.out.println("A1: 594 * 841 mm(23.4 * 33.1 inches)");
                break;
                
            case "A2":
                System.out.println("A2: 420 * 594 mm(16.5 * 23.4 inches)");
                break;
                
            case "A3":
                System.out.println("A3: 297 * 420 mm(11.7 * 16.5 inches)");
                break;
                
            case "A4":
                System.out.println("A4: 210 * 297 mm(8.3 * 11.7 inches)");
                break;
                
            case "A5":
                System.out.println("A5: 148 * 210 mm(5.8 * 8.3inches)");
                break;
                
            default:
                System.out.println("Error Paper Size");
                break;
        }
        sc.close();
    }
}