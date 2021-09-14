import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
    
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-11-official/ojquestion
