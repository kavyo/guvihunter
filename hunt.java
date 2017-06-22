import java.io.*;
import java.util.*;
public class hunt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();    
        }
        for(int j=0;j<arr.length;j++)
        {
        for(int k=j+1;k<arr.length;k++)
        {
        if(arr[j]==arr[k])
        {
        for(int q=0;q<res.length;q++)
        {
        if(res[m]!=arr[j])
        {
        res[m]=arr[j];    
        }
        }
        m++;
        }
        }
        }
    for(int y=0;y<m;y++)
    {
    System.out.println(res[y]);    
    }
    }
}


