
import java.util.*;
public class Series1 {
	
	
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number");
	        int m=sc.nextInt();
	        
	        double sum=0.0;
	        
	        int a=2;               
	        
	        int ch=2;
	        switch(ch)
	        {
	            
	            case 2:for(int i=1;i<=m;i+=3)

	                sum=i/((Math.pow(a,2))*(Math.pow(a,(i-1))));
	            System.out.println(sum);
	            break;
	            default:System.out.println("Invalid choice");
	        }
	        sc.close();
	    }
}