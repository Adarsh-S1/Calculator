
import java.util.*;
public class Replacer 
{
	
	
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String str;
	        System.out.println("INPUT A STRING");
	        str=sc.nextLine();
	        System.out.println("INPUT THE STRING OR CHARACTER TO REMOVED");
	        String ch=sc.next();
	        System.out.println("INPUT THE STRING OR CHARACTER TO BE REPLACED");
	        String ch1=sc.next();
	        System.out.println(str.replace(ch,ch1));
	        sc.close();
	    }
	    
	}



