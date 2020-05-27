import java.util.*;
class MergeArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long P[]=new long[6];
        long Q[]=new long[4];
       
        int i,j;
        System.out.println("Enter elements into array p");
        for(i=0;i<6;i++)
        {
            P[i]=sc.nextInt();
            
        }
    
        System.out.println("Enter elements into array q");
        for(j=0;j<4;j++)
        {
            Q[j]=sc.nextInt();
            
        }
        
         System.out.println("The merged array is R[]");
          for(i=0;i<6;i++)
        {
            System.out.print(P[i]+" ");
        }
        for(j=0;j<4;j++)
        {
            System.out.print(Q[j]+" ");
        }
        sc.close();
        }
    }
        
        
        
        
       