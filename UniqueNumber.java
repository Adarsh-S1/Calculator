import java.util.*;
class UniqueNumber
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT ANY STRING");
        String str,str1="",str3;
        str=sc.nextLine();
        char ch;
        int l,i,str2=0,m=0;
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            str1+=ch;
            m++;
            str3=str1.substring(0,m);
            for(int j=0;j<i;j++)
            {
              char z=str3.charAt(j);
             if(ch==z)
                
                    str2=0;
                else
                str2++;
            }
        
        }
        if(str2>0)
        System.out.println("it is not ");
        else
        System.out.println("it is  ");
        sc.close();
}
        
}       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
            
            
            
            
            
            
            
           