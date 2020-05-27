import java.util.*;
public class LongestWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,w,wl;
        int l,llw=0;

        w="";wl="";
        System.out.println("Input the string");
        str=sc.nextLine();
        str=str+' ';
        l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')

                w+=ch;

            else 
            {
                if(w.length()>llw)

                {llw=w.length();
                    wl=w;
                }
                w="";
            }
        }

        System.out.println("The longest word is "+wl);
        System.out.println("the number of char present in the longest word is "+llw);
        sc.close();

    }
}

            
            
            
