public class IncreasingTriangle{
    public static void main(String[] args){
        for(int i=1;i<=5;i++)//outer loop for row
        {
            for(int j=1;j<=i;j++)//inner loop for column
            {
                System.out.print(j);
            }
            //moves to next line after finishing each row.
            System.out.println();
        }
    }
}