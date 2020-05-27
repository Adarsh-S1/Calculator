import java.util.*;
class Series3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x;
        double s=0.0;
        System.out.println("Enter the number upto where this should stop");
        n=sc.nextInt();
        System.out.println("enter the numerator");
        x=sc.nextInt();
        for(int i=1;i<=n;i++)
        
           if(i%2==0)
           s+=(x/i);
           else
           s-=(x/i);
           
           System.out.println(Math.abs(s));
           sc.close();
        }
    }
    