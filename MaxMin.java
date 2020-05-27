import java.util.*;
class MaxMin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int min,max;
        System.out.println("Input elements into array");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        max=0;
        min=ar[n-1];
         for(int i=0;i<n;i++)
        {
            if(ar[i]>max)
            {
             max=ar[i];   
        }
        else if(ar[i]<min)
        {
        min=ar[i];
        }
       
}
        System.out.println(max+"\n"+min);
        sc.close();
    }
        
        
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        