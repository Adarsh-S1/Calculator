

	import java.util.*;
	public class ISBN
	{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int s=0;
	        System.out.println("Enter the ISBN number");
	        long d=sc.nextLong();
	        if(Long.toString(d).length()==13)
	        {
	        long e;
	        int n=1000000000;
	        for(int i=1;i<=10;i++)
	        {
	            e=d/n;
	            s+=(i*e);
	            n=n/10;
	        }
	        if(s%11==0)
	        {
	            System.out.println("IT IS  AN ISBN NUMBER");
	        }
	        else
	        {
	        System.out.println("IT IS NOT A ISBN NUMBER");
	    }
	}
	else{
	System.out.println("Invalid ISBN NUMBER");
    sc.close();

	}
	}
	
	















}
