
import java.util.*;
class Pattern1
{
    public static void main (String args[])
    {
Scanner sc=new Scanner(System.in);
        int str;
        System.out.println("INPUT ANY NUMBER FOR TRIANGLE");
        str=sc.nextInt();
        for(int i=1;i<=str;i++)
        {

            for(int j=1;j<=i;j++)
            {
                if(i%2==1)
                System.out.print("*");
               
            }
            System.out.println();
        }
        sc.close();
    }
    
}


