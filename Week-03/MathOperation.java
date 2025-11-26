
public class MathOperation
{
   public static void main(String[] args){
       int a = 10;
       int b = 3;
       
       System.out.println("Arithmetic Operator");
       System.out.println("-------------------- ");
       // 1. Sum
       int sum = a+b;
       System.out.println("Sum:" + sum);
       
       // 2. Subtraction
       int diff = a-b;
       System.out.println("Subtraction:" + diff);
       
       // 3. multiplication
       int mul = a * b;
       System.out.println("Multiplication:" + mul);
       
       // 4. division
       int div = a / b;
       System.out.println("division:" + div);
       
       // 5. modulus
       int mod = a % b;
       System.out.println("modulus:" + mod);
       System.out.println(" ");
       
       //Unary Operator
       System.out.println("Unary Operator");
       System.out.println("--------------");
       System.out.println("postincrement:" + (a++));
       System.out.println("preincrement:" + (++a));
       System.out.println("postdecrement:" + (a--));
       System.out.println("predecrement:" + (--a));
       System.out.println(" ");
       
       //Assignment Operator
       System.out.println("Assignment Operator");
       System.out.println("-------------------");
       a += 2;
       System.out.println("after += :" + a);
       
       a -= 2;
       System.out.println("after -= :" + a);
       
       a *= 2;
       System.out.println("after *= :" + a);
       
       a /= 2;
       System.out.println("after /= :" + a);
       
       b %= 2;
       System.out.println("after %= :" + b);
       System.out.println(" ");
       
       //Relational Operator
       System.out.println("Relation Operator");
       System.out.println("------------------ ");
       System.out.println("a > b: " + (a > b));
       System.out.println("a < b: " + (a < b));
       System.out.println("a >= b: " + (a >= b));
       System.out.println("a <= b: " + (a <= b));
       System.out.println("a == c: " + (a == b));
       System.out.println("a != c: " + (a != b));
       System.out.println(" ");
        
       //Logical operator
       System.out.println("Logical Operator");
       System.out.println("-----------------");
       boolean c = true;
       boolean d = false;
       System.out.println("c && d: " + (c && d));
       System.out.println("c || d: " + (c || d));
       System.out.println("!c: " + (!c));
       System.out.println(" ");
        
       //Ternary Operator
       System.out.println("Ternary Operator");
       System.out.println("----------------");
       int checkingternary;
       checkingternary = (a>b)? a : b;
       System.out.println(checkingternary);
       System.out.println(" ");
        
       // bitwise operator
       System.out.println("Bitwise Operator");
       System.out.println("----------------");
       System.out.println("a & b: " +(a & b));
       System.out.println("a | b: " +(a | b));
       System.out.println("a ^ b: " +(a ^ b));
       System.out.println("~a: " +(~a));
       System.out.println("a << 2: " + (a << 2));
       System.out.println("a >> 3: " + (a >> 3));
       System.out.println(" ");
       
        
       // instanceof Operator
       // it is used for type checking.
       System.out.println("Instanceof Operator");
       System.out.println("------------------- ");
       String str = "what";
       System.out.println(str instanceof String);
       //if the instanceof int is placed then it displays false output
   }
}