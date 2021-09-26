import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int max= arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int j=max;j>=1;j--)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]>=j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
//https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/fb0b38c2-0ed6-4e9d-8c28-541d16e49cd4/
