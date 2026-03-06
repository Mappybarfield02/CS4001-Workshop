
public class RightAlignedTriangle
{
    public static void main(String[] args){
    // outer loop 
     for(int i = 1; i<=5; i++){
         //inner loops 
         for(int j=1; j<=5-i; j++){
             System.out.print(" ");
         }
         for(int k=1; k<=i; k++){
             System.out.print(k);
         } 
         //this line jumps to next one
         System.out.println();
     }
}
}

