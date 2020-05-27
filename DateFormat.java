import java.io.*;
class DateFormat
{
    public static void main(String args[])throws Exception 
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int dd=0,mm=0,yy=0;
        System.out.println("Enter date");
        System.out.print("dd:");
        dd=Integer.parseInt(buf.readLine());
        System.out.print("mm:");
        mm=Integer.parseInt(buf.readLine());
        System.out.print("yy:");
        yy=Integer.parseInt(buf.readLine());
        System.out.println();
        String fmtDate=dateMediumFormat(dd,mm,yy);
        System.out.println("Formatted date is:"+fmtDate);
    }

    public static String dateMediumFormat(int dd,int mm,int yy)throws Exception
    {
        String a[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        StringBuffer str=new StringBuffer();
        str.append(Integer.toString(dd));
        str.append("-");
        str.append(a[mm-1]);
        str.append("-");
        str.append(Integer.toString(yy));
        return str.toString();
    }
}

        
         