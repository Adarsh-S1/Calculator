import java.util.*;
class PositionIndex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        str=str.toLowerCase();
        char ch;
        int l=str.length();
         System.out.println("characters\tposition\tindex no");
        for(int i=1;i<=l;i++)
        {
           ch=str.charAt(i-1);
           
           
     System.out.println("   "+ch+"\t\t"+"   "+i+"\t\t"+"   "+(i-1));
    }
        sc.close();
}
}
 

                   
                   
                   



