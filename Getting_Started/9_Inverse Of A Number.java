import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m=n;
    int sum=0,p=1;
    while(n!=0)
    {
        int rem = n%10;
        sum=sum+(p*(int)Math.pow(10,rem-1));
        p++;
        n=n/10;
    }
    System.out.print(sum);
 }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion
