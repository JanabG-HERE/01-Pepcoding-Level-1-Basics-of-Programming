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
           int rem=n%10;
           n=n/10;
           sum=sum+rem*tp;
           tp*=b;
       }
       return sum;
   }
  }
//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-to-decimal-official/ojquestion
