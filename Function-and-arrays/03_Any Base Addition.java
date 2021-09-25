import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
    int sum =0, c = 0,p=0;
    while(n1>0 || n2>0 || c>0)
    {
        int d1 = n1%10;
        n1/=10;
        int d2 = n2%10;
        n2/=10;
        
        int d = d1+d2+c;
        c= d/b;
        int k = d%b;
        sum+=k*(int)Math.pow(10,p);
        p++;
    }
    return sum;
   }
  }
  //https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/a434cb55-cae2-499d-87b2-6fc0b3f8aa1b/
