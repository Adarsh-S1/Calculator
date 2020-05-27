import java.util.*;
class CommaInsert
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT ANY STRING");
        String str=sc.nextLine();
        char ch;
        String str1="";
        int l,i;
        l=str.length();
        for(i=0;i<l;i++)
        {
        ch=str.charAt(i);
        str1+=ch;
        str1=str1.trim();
        if(ch==' ')
        {
            str1+=",";
        }
        
    }
    
        System.out.println(str1);
        sc.close();
    }
    
}

            
            
            
            
            
            
            
            
            
            
            