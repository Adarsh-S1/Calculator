import java.io.*;
public class ReverseSum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String s,str="";
        System.out.println("Enter a number");
        int n=Integer.parseInt(buf.readLine());
        s=Integer.toString(n);
        int l=s.length();
        char ch;
        for(int i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            str=str+ch;       
        }
        int n1=Integer.parseInt(str);
        sum=n+n1;
       System.out.println("sum is "+sum);           
    }
}
        