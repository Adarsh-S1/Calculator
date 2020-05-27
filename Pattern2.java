import java.util.*;
class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.PATTERN OF A NUMBER \n 2.PATTERN OF A WORD");
        char ch=sc.next().charAt(0);
        int i,j,l;
        switch(ch)
        {
            case '1':for(i=1;i<=5;i++)
            {
                for(j=5;j>=i;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
            case '2':System.out.println("Enter a word");
            String str=sc.next();
            l=str.length();
            for(int k=0;k<l;k++)
            {
                System.out.println(str.substring(0,k+1));
            }
            break;
             default:System.out.println("INVALID CHOICE...");     
        }
        sc.close();
    }

}
            

            
            
            
            
            
            
            
            
            
            
            
            
            