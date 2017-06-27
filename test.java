import java.io.*;
import java.util.*;
import java.lang.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer s1=new StringBuffer(s);
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    s1=s1.deleteCharAt(j);
                }
            }
        }
        System.out.println(s1);
        
    }
}
