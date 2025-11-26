
public class DataTypeInspector
{
    public static void main(String[] args){
        
    //Declaring and initializing values
    boolean b = true; // (1 bit)
    byte by = 20; //(1 byte signed integer)
    int i = 20; //(4 byte signed interger)
    float f = 20.34f; //(4 byte signed integer)
    long l = 200000L; //(8 byte signed integer)
    double d = 20.1234; //(8 byte signed integer)
    short s = 20; //(2 byte signed integer)
    char c = 'A'; //(2 byte unicode characters)    
        
    //printing values
    System.out.println("boolean value: " + b);
    System.out.println("byte value: " + by);
    System.out.println("integer value: " + i);
    System.out.println("float value: " + f);
    System.out.println("long value: " + l);
    System.out.println("double value: " + d);
    System.out.println("short value: " + s);
    System.out.println("char value: " + c);
    }
}