import java.util.*;
class CalcArray
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY NUMBERS YOU HAVE TO CALCULATE");
        int n=sc.nextInt();
        int i;
        long c=0,d=0,e=1;
        int z[]=new int[n];
        System.out.println("INPUT THE ELEMENTS");
        for(i=0;i<n;i++)
        {
            z[i]=sc.nextInt();
            c=c+z[i];
            d=-z[i]-d;
            e=e*z[i];
        }
        System.out.println("IF YOU WANT TO ADD PRESS + , PRESS - TO SUBTRACT,PRESS * FOR MULTIPLICATION");
        char h=sc.next().charAt(0);
        if(h=='+')
            System.out.println("THE SUM OF  NUMBERS IS "+c);
        if(h=='-')
            System.out.println("THE DIFFRENCE OF  NUMBERS IS "+d);
        if(h=='*')
            System.out.println("THE PRODUCT OF  NUMBERS IS "+e);
        sc.close();


    }
}
            
            
            
            
            
            
            
