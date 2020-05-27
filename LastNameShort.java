import java.util.*;
class LastNameShort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str2="",str3="";
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        
        char ch;
        int flag=0;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(flag==0)
            {
            
                str3+=ch;
                if(ch==' ')
            {
                flag=1; 
            }
        }
              if(flag==1)
              {
                  if(ch==' ')
                  str2+="."+str.charAt(i+1);
            }
            
        }
        System.out.println(str3.trim()+str2.trim());
        sc.close();

    }
}               
                
            
            