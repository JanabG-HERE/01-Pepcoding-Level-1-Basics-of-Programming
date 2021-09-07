import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp= n;
        int counter = 0;
        while(temp!=0) {
            temp /= 10;
            counter++;
        }
        k=k%counter;
        if(k<0)
        {
            k=k+counter;
        }
        int rem=1,quo=1;
        int div=(int)Math.pow(10,k),mult=(int)Math.pow(10,counter-k);
        rem = n%div;
        quo = n/div;
        System.out.println((rem*mult)+quo);
    }
}
//https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion
