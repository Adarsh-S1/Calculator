import java.util.*;
class PrimeNumber
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS PRIME OR NOT");
        int a=sc.nextInt();
        int flag=0;
        for(int i=2;i>a;i++)
        {
            if(a%1==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("not prime");
        }else{
            System.out.println(" prime");
        }
        sc.close();
    }
}