import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i=1;i<=n;i++)
        {
           int j=1; 
           while(j<=i)
           {
               System.out.print("*\t");
               j++;
           }
           System.out.println();
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-1-official/ojquestion
