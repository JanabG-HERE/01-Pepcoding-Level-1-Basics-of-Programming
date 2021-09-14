import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nsp = (n+(n-1))-2;
    for(int i=1;i<=n;i++)
    {
        if(i==n)
        {
            int val=1;
            for(int m=1;m<=(n+(n-1));m++)
            {
               if(m<=n){
                   System.out.print(val+"\t");
                   val++;
                   if(m==n){
                       val--;
                   }
               }
               else{
                   val--;
                   System.out.print(val+"\t");
                   
               }
            }
            break;
        }
        int valf=1;
        for(int j=1;j<=i;j++)
        {
            
            System.out.print(valf+"\t");
            valf++;
        }
        valf--;
        for(int j =1;j<=nsp;j++)
        {
            System.out.print("\t");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(valf+"\t");
            valf--;
        }
        System.out.println();
        nsp-=2;
    }
    
  }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-16-official/ojquestion
