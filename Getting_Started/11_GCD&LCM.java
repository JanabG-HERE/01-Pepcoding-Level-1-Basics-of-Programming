import java.util.*;

public class Main {


  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int a=n1,b=n2;
    while(a%b!=0)
    {
        int r = a%b;
        a=b;
        b=r;
    }
    
    System.out.println(b);
    System.out.println((n1*n2)/b);  
    
  }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/gcd-and-lcm-official/ojquestion
