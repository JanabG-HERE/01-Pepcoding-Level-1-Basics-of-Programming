import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int nst=n;
        int nsp=0;
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
            nst--;
            nsp++;
        }

    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-4-official/ojquestion
