import java.util.*;
class Encoding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str2="";
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        char ch;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            str2=str2+(char)(ch+2);
        }
        System.out.println(str2);
        sc.close();

    }
}