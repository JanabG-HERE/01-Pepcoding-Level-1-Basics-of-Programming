import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int nst=(n/2)+1;
        int nsp=1;
        int mst=(n/2)+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
            for(int k=1;k<=nsp;k++)
            {
                System.out.print("\t");
            }
            for(int l=1;l<=mst;l++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=(n/2))
            {
                nst--;
                mst--;
                nsp+=2;
                
            }
            else
            {
                nst++;
                mst++;
                nsp-=2;
            }
            
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-6-official/ojquestion
