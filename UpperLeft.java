import java.util.*;
class UpperLeft
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT THE SIZE OF ARRAY");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int i,j;
        System.out.println("Input elements into array");
        for(i=0;i<n;i++)
        {
            System.out.println("Row"+(i+1));
            for(j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
        System.out.println();
    }
    System.out.println("upper left triangle elements are");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j<=(n-1))
                {
                System.out.print(ar[i][j]+" ");
                System.out.print(" "+" ");
            }
        }
        System.out.println();
    }
        sc.close();
}
}
