import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //write your code here
    int n = scn.nextInt();
    int num=1;
    for(int i=0;i<n;i++)
    {
        int val = 1; //first value is always 1
        for(int j = 0;j<num;j++)
        {
            System.out.print(val+"\t");
            int nextVal=val*(i-j)/(j+1);
            val=nextVal;
        }
        System.out.println();
        num++;
    }
  }
}
//https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-13-official/ojquestion
