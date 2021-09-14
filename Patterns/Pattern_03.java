import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            for(int k=1;k<=nst;k++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-3-official/ojquestion
