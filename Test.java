import java.io.*;
class Test
{
    public int TESTj(int a,int b)
    {
        int c=Math.max(a,b);
        return c;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        Test i=new Test();
        System.out.println("ENTER TWO NUMBERS FOR TO FIND THE GREATEST AMONG THEM");
        int j=Integer.parseInt(buf.readLine());
        int k=Integer.parseInt(buf.readLine());
        i.TESTj(j,k);
        System.out.println(i.TESTj(j,k));
    }
}