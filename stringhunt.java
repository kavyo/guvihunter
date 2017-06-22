import java.io.*;
import java.util.*;
public class stringhunt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String s3="";
        int r=Integer.parseInt(s);
        int y=Integer.parseInt(s1);
        int res=r*y;
        String re=String.valueOf(res);
        System.out.println(res);
    }
}
