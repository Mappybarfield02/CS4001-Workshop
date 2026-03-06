import java.util.Scanner;
public class SimpleCalculator
{    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //repeats the block of code as long as the conndition of while is true until we use break explicity.
        while(true){
                System.out.println("Enter your first number or type(stop)");
                //.hasNext() is the method of scanner. 
                //it checks the token. "token" = chunks of word in buffer.
                //returns boolean value: true if token available, false if not.
                if(scanner.hasNext("stop")){
                System.out.print("You can comeback, when you need to calculate");
                break;
                }
                double num1 = scanner.nextDouble();
                System.out.println("Enter your second number");                
                double num2 = scanner.nextDouble();
                scanner.nextLine();//it consumes the \n from the buffer that holds in nextDouble().
                System.out.println("enter the operator(+, -, *, /)");
                String operator = scanner.next();
                // only read one token
                switch(operator){
                    case "+":
                        System.out.println("sum of 2 numbers: " + num1+num2);
                        break;
                    case "-":
                        System.out.println("difference of 2 numbers: " + (num1-num2));
                        break;

                    case "*":
                        System.out.println("multiplication of 2 numbers: " + num1*num2);
                        break;
                    case "/":
                        System.out.println("division of 2 numbers: " + num1/num2);
                        break;
                    default:
                        System.out.println("invalid operator");
                }           
            }
            scanner.close();
        }
}