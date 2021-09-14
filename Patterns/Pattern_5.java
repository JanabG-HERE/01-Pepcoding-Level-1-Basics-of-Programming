import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int nsp = n/2;
        int nst=1;
        int flagsp=0;
        int flagst=0;
        for(int i=1;i<=n;i++)
        {
            //System.out.print(nsp+"sp "+nst+"st");
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            for(int k=1;k<=nst;k++)
            {
                System.out.print("*\t");
            }
            
            if(i<=(n/2))
            {
                nsp--;
                nst+=2;
            }
            else
            {
                nsp++;
                nst-=2;
            }
            
            
            System.out.println();
        }
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-5-official/ojquestion
