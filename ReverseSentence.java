import java.util.*;
class reversestring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str3="",t="";
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        char ch;
        str=" "+str+" ";
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            t=t+ch;
            else
            {
                str3=" "+t+str3;
                t="";
            }
        }
        str3=str3.trim();
        System.out.println(str3);
        sc.close();
    }
}

        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            