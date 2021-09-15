import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int sum=0,tp=1;
       while(n!=0)
       {
           int rem=n%b;
           n=n/b;
           sum=sum+rem*tp;
           tp*=10;
       }
       return sum;
   }
  }
//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/decimal-to-any-base-official/ojquestion
