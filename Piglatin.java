import java.util.*;
class Piglatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str2="",str3="";
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        str=str+" ";
        char ch;
        int flag=0;
        int l=str.length();
        for( int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
            {
                str2+=ch;
                flag=1;
                str3=str.substring((i+1),str.lastIndexOf(" "));
                break;

        }
    }
        if(flag==1)
        {
            str="";
            str=str3+str2+"ay";
            System.out.println(str);
        }
        sc.close();
    }
}
                
                
                
                
                