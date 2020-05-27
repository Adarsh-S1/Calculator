import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=sc.nextInt();
        String n=Integer.toString(m);
        String str2="";
        int l=n.length();
        for(int i=l-1;i>=0;i--)
        {
          char ch=n.charAt(i);  
         str2+=ch;
         
        }
        if(n.equals(str2))
        {
             System.out.println("IT IS A PALINDROME");
            }
            else
            {
                System.out.println("IT IS NOT A PALINDROME");
            } 
        sc.close();
    }
}

    
    
    