import java.util.*;
class Series2
{
    public static void main (String args[])
    {
        int n,i;
        double s=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT THE VALUE FOR N");
        n=sc.nextInt();
        for(i=1;i<=n;i++)

            s+=1/(Math.pow(i,2));
        System.out.println("SUM OF THE SERIES IS "+s);
        sc.close();
    }
}