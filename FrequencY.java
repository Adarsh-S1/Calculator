import java.util.Scanner;
class FrequencY
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("INPUT ANY STRING");
        str=sc.nextLine();
        str=str.toLowerCase();
        char ch,ch1;
        int k=0;
        int l=str.length();
        System.out.println("characters\tfrequency");
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            for(int j=0;j<l;j++)
            {
                ch1=str.charAt(j);
                if((int)ch==(int)ch1)

                    k++;
                    
            } 
            
            System.out.println(ch+"         \t"+k);
            k=0;
        }
        sc.close();
    }
}
