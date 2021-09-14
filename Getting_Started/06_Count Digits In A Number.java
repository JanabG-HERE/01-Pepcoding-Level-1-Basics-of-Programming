import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count=0;
    while(n!=0)
    {
        n/=10;
        //n%=10;
        count++;
    }
    System.out.print(count);
   }
  }
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/count-digits-official/ojquestion
