import java.util.*;
class Quadratic
{
    public static void main (String args[])
    {
        double a,b,c,r,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE OF A,B,C");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        r=-b+Math.sqrt(b*b-4*a*c);
        h=-b-Math.sqrt(b*b-4*a*c);
        if(r==0&&h==0)
            System.out.println("Roots are real and unequal");
        else

            System.out.println("Imaginary Roots");
        sc.close();
    }
}