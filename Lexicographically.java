import java.util.*;
class Lexicographically
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        char ch;
        String str2="";
        int l=str.length();
        
            for(int j=97;j<=122;j++)
            {
        for(int i=0;i<l;i++)
        {
                ch=(char)(j);
                if(str.charAt(i)==ch)
                {
                    str2+=" "+ch;
                    break;
                }
       
            }
        }
        System.out.println(str2);
        sc.close();

    }
                }
             
                
                
                
                
                
                
                
                
                
                
                
