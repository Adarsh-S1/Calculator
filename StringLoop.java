import java.util.*;
class StringLoop
{
    public static void main (String args[])
    {
Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        for(int i=-1;i<6;i++)
        {

            for(int j=-1;j<i;j++)
            {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
        sc.close();
    }
}





