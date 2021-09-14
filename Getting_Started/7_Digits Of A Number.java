import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int div = 1;
    int org = n;
    while (n >= 10)
    {
        n=n/10;
        div=div*10;
    }
    while(div>=1)
    {
        int a = org/div;
        org=org%div;
        System.out.println(a);
        div=div/10;
    }
  }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/digits-of-a-number-official/ojquestion
