import java.util.*;

public class Main{
    
    static void printPrime(int n, int m)
    {
        while(n<=m){
        int flag=0;
            if(n==2||n==3){
                System.out.println(n);
                n++;
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
                System.out.println(n);
            }
            n++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();
        printPrime(n,m);
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/print-all-primes-till-n-official/ojquestion
