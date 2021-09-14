import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nosp=(n/2);
        int nisp=-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nosp;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1;j<=nisp;j++)
            {
                System.out.print("\t");
            }
            if(i>1&&i<n)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2)
            {
                nosp--;
                nisp+=2;
            }
            else
            {
                nosp++;
                nisp-=2;
            }
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-10-official/ojquestion
