import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int st = 0, lt = 1, i = 1;
    //System.out.println(st + "\n" + lt);
    while (i <= n)
    {
      int ans = st + lt;
      System.out.println(st);
      lt = st;
      st = ans;
      i++;
    }
  }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/fibonacci-till-n-official/ojquestion
