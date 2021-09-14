import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nsp=(n/2);
        int nst=1;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            int l=k;
            for(int j=1;j<=nst;j++)
            {
                System.out.print(l+"\t");
                if(j<=(nst/2))
                {
                    l++;
                }
                else
                {
                    l--;
                }
            }
            System.out.println();
            if(i<=n/2)
            {
                nsp--;
                nst+=2;
                k++;
            }
            else
            {
                nsp++;
                nst-=2;
                k--;
            }
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-15-official/ojquestion
