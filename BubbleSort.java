import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int i,j,temp=0;
        System.out.println("Input the size of array");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Input the arrays elements");
        for(i=0;i<n;i++)
            A[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1-i);j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;

                    
                }  
            }
            }
            System.out.println("The sorted array is");
            for(i=0;i<n;i++)
            System.out.println(A[i]);
            sc.close();

        }
        
        
    }



                
                
                
                
           
