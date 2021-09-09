import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = ((a>b?a:b)>c?(a>b?a:b):c);
    if(a==max)
    {
      if((b*b)+(c*c)==(max*max)){
        System.out.print("true");
        System.exit(0);
      }
    }
    if(b==max)
    {
       if((a*a)+(c*c)==(max*max)){
        System.out.print("true");
        System.exit(0);
      } 
    }
    if(c==max)
    {
       if((a*a)+(b*b)==(max*max)){
        System.out.print("true");
        System.exit(0);
      } 
    }
    System.out.print("false");
   }
  }
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/pythagorean-triplet-official/ojquestion
