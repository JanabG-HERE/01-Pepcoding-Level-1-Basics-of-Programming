import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int min =arr[0];
    int max = arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        if(arr[i]>max)
        {
            max= arr[i];
        }
    }
    System.out.print(max-min);
 }

}
//https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/9e59f91b-4cb4-42c8-b0bb-c139f18beda2/
