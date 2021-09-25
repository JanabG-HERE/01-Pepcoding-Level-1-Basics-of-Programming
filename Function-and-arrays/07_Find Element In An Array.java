import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int val = sc.nextInt();
    int flag=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==val)
        {
            System.out.println(i);
            flag=1;
            break;
        }
        
    }
    if(flag==0)
    {
        System.out.println("-1");
    }
 }

}
//https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/7d9fc084-acf3-4f4f-b89a-6870943538c4/
