import java.io.*;
public class Tax
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        double ti;
        double amt;
        int age;
        String cname;
        System.out.println("INPUT NAME OF THE COSTUMER");
        cname=buf.readLine();
        System.out.println("INPUT AGE");
        age=Integer.parseInt(buf.readLine());
        if (age<60)
        {
            System.out.println("WRONG CATEGORY");
        }
        else 
        {
            System.out.println("INPUT THE TAXABLE INCOME");
            ti=Double.parseDouble(buf.readLine());
            if(ti<=250000.0)
                amt=0;
            else if(ti>250000.0&&ti<=500000.0)
                amt=(ti-160000.0)*10.0/100.0;
            else if(ti>500000.0&&ti<=1000000.0)
                amt=(ti-500000.0)*20.0/100.0+34000.0;
            else
                amt=(ti-1000000.0)*30.0/100.0+94000.0;
            System.out.println("THE COSTUMER'S NAME IS "+cname);
            System.out.println("THE COSTUMER'S AGE IS "+age);
            System.out.println("THE INCOME TAX IS "+amt);
        }
    }
}
