import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int sum=0,p=0,k=0;
       while(n2>0)
       {
           int d1 = n1%10;
           n1/=10;
           int d2 = n2%10;
           n2/=10;
           
           int d = d2-k-d1;
           
           if(d<0)
           {
               k=1;
               d=d+b;
           }
           else{
               k=0;
           }
           sum+=d*(int)Math.pow(10,p);
           p++;
           
       }
       return sum;
   }
  
  }
//https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/48a7001c-e922-4ff7-9a76-9b3aef2ca60e/
