
public class DefaultValues
{
    //instance variables 
    boolean b;
    byte by;
    short s;
    int i;
    float f;
    long l;
    double d;
    char c;
    
  public static void main(String[] args){
      
    //create instance of class
    DefaultValues obj = new DefaultValues();
      
    //printing default values of primitve data type
    System.out.println("Default values of boolean: " + obj.b);
    System.out.println("Default values of byte: " + obj.by);
    System.out.println("Default values of short: " + obj.s);
    System.out.println("Default values of int: " + obj.i);
    System.out.println("Default values of float: " + obj.f);
    System.out.println("Default values of long: " + obj.l);
    System.out.println("Default values of double: " + obj.d);
    System.out.println("Default values of char: " + obj.c); 
  }
}
/*
 * Explanation:
 * - In Java, member variables (fields) of a class are automatically assigned default values.
 * - For example: int → 0, boolean → false, char → '\u0000', etc.
 * - However, local variables (declared inside methods) do NOT get default values.
 * - If you try to use a local variable without initializing it, the compiler will throw an error:
 *   "variable might not have been initialized".
 */
    