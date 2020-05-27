import java.util.*;
class MenuDriven1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,m,n,h=9,flag=0,d;
        System.out.println("Enter your number");
         n=sc.nextInt();
        System.out.println("1.TO CHECK FOR COMPOSITE NUMBER \n2.TO CHECK FOR THE SMALLEST DIGIT IN TTHE NUMBER");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '1':for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag ==1)
                System.out.println("IT IS A PRIME NUMBER");
                else
                 System.out.println("IT IS A COMPOSITE NUMBER");
            break;
            case '2':while(n>0)
                   {
                       d=n%10;
                       m=d;
                      
                       if(m<=h)
                       h=m;
                       
                       n=n/10;
                    }
                       System.out.println("THE SMALLEST NUMBER IS "+h);           
                       break;
                    
                       default:System.out.println("INVALID CHOICE...");     
        
    }
        sc.close();
}
}








