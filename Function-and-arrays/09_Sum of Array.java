import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int j=0;j<n2;j++)
        {
            arr2[j]=sc.nextInt();
        }

        int c=0;
        int[] sum = new int[Math.max(n2, n1)];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while(k>=0)
        {
            int d =c;
            if(i>=0)
            {
                d+=arr1[i];
            }
            if(j>=0)
            {
                d+=arr2[j];
            }

            c = d/10;
            sum[k]=d%10;

            i--;
            j--;
            k--;
        }
        if(c>0)
        {
            System.out.println(c);
        }
        for(int x =0;x<sum.length;x++)
        {
            System.out.println(sum[x]);
        }


    }

}
//https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/b3231fda-6a89-4c4b-b53c-7f7683dbf1c8/
