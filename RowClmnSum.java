
import java.util.*;
public class RowClmnSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,r,c;
        long sum=0;
        double avg=0.0;
        
        System.out.println("Input the row and column size");
        r=sc.nextInt();
        c=sc.nextInt();
        int ar[][]=new int[r][c];
        System.out.println("Input the elements into array");
        for(i=0;i<r;i++)
        {
            System.out.println("Row"+(i+1));
            for(j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
                sum+=ar[i][j];
            }
        }
        avg=sum/(r*c);
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
        sc.close();
    }
}

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        