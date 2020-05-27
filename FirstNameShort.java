import java.util.*;
class FirstNameShort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str2="",str3="",str4="";
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        char ch;
        str=" "+str;
        int l2=str.length();
        int l=str.lastIndexOf(' ');
       for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
                str2+=str.charAt(i+1)+".";
               
            }
            str3=str.substring(l,l2);
            String str5=str3.trim();
            str4=str2+str5;
            System.out.println(str4);
            sc.close();

        }
        
    }
                
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           
     








