
import java.util.*;
public class NumbOfNotes {
	
	public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	      int amt,bal=0,r2000=0,r500=0,r200=0,r100=0,r5=0;
	      System.out.println("Enter your amount");
	      amt=sc.nextInt();
	       bal=amt;
	      r2000=bal/2000;
	      bal=bal%2000;
	      r500=bal/500;
	      bal=bal%500;
	      r200=bal/200;
	      bal=bal%200;
	      r100=bal/100;
	      bal=bal%100;
	      bal=bal%50;
	      bal=bal%20;
	      bal=bal%10;
	      bal=bal%2;
	      System.out.println("Amount is:Rs."+amt);
	      System.out.println("Rs 2000 Notes:"+r2000);
	      System.out.println("Rs 500 Notes:"+r500);
	      System.out.println("Rs 200 Notes:"+r200);
	      System.out.println("Rs 100 Notes:"+r100);
	      System.out.println("Rs 50 Notes:"+r5);
	      System.out.println("Rs 20 Notes:"+r2000);
	      System.out.println("Rs 10 Notes:"+r2000);
	      System.out.println("Rs 5 Notes:"+r2000);
	      System.out.println("Rs 2 Notes:"+r2000);
	      System.out.println("Rs 1 Notes:"+r2000);
	      
	      sc.close();
	    }
	}









