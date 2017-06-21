import java.io.*;
import java.util.*;
public class hunter3
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=sc.nextInt();    
    }
    for(int j=0;j<arr.length;j++)
    {
    if(arr[j]==j)
    System.out.println(arr[j]);
    }
    }
}
