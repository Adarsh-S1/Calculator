import java.io.*;
public class EletricityBoard
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int cno;
        String cname;
        double units,amt,qmt;
        System.out.println("INPUT NAME OF THE COSTUMER");
        cname=buf.readLine();
        System.out.println("INPUT NUMBER OF THE COSTUMER");
        cno=Integer.parseInt(buf.readLine());
        System.out.println("INPUT THE UNITS CONSUMED");
        units=Double.parseDouble(buf.readLine());
        if(units<=100)
            amt=4.80*units;
        else if(units<=300)
            amt=(100.0*4.80)+((units-100)*5.50);
        else if(units<=600)
            amt=(100.0*4.80)+(200*5.50)+((units-300)*6.80);
        else
            amt=(100.0*4.80)+(200*5.50)+(300*6.80)+((units-600)*7.50);
        qmt=amt*3.0;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                      WBEB");
        System.out.println("                  MONEY RECEIPT");
        System.out.println("CONSUMER NUMBER="+cno);
        System.out.println("COSTUMER NAME="+cname);
        System.out.println("UNITS CONSUMED="+units);
        System.out.println("AMOUNT TO BE PAID QUARTERLY="+amt);
        System.out.println("MONTHLY AMOUNT="+qmt);
    }
}

