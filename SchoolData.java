import java.util.*;
public class SchoolData {
	
	
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Input the size of array");
	        int n=sc.nextInt();
	        int ad[]=new int[n];
	        String nm[]=new String[n];
	        int i,admn,flag=0;
	        System.out.println("Input the admission number of students along with their names");
	        for( i=0;i<n;i++)
	        {
	            ad[i]=sc.nextInt();
	            nm[i]=sc.next();
	        }
	        System.out.println("Enter the admission number of a student to be searched for");
	        admn=sc.nextInt();
	        for(i=0;i<n;i++)
	        {
	           if(ad[i]==admn)
	           {
	               flag=1;
	               break;
	            }
	        }
	        if(flag==1)
	        {
	            System.out.println("Search successfull");
	            System.out.println("the element is found in index"+ad[i]+" "+nm[i]);
	        }
	        else
	        System.out.println("UNsuccessfull search");
	        sc.close();
	    }	        	        
}
