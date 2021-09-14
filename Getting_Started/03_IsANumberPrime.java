import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t= scn.nextInt();
        while(t!=0)
        {
            long n = scn.nextLong();
            int flag=0;
            if(n==2||n==3){
                System.out.println("prime");
                t--;
                continue;
            }
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
            t--;
        }

    }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/is-number-prime-official/ojquestion
