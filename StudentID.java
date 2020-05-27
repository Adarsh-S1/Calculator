
import java.io.*;
public class StudentID
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INPUT NAME");
        String n=buf.readLine();
        System.out.println("INPUT GENDER");                                        
        String g=buf.readLine();
        System.out.println("INPUT ROLL NO");
        int r=Integer.parseInt(buf.readLine());
        System.out.println("INPUT PHONE NUMBER");
        long o=Long.parseLong(buf.readLine());
        System.out.println("");
        System.out.println("ALL SUBJECTS MARKS ARE OUT OF HUNDRED...SO TYPE ALL MARKS OUT OF HUNDRED");
        System.out.println();
        System.out.println("INPUT THE MARK OF ENGLISH I");
        int m1=Integer.parseInt(buf.readLine());
        if(m1>100)
            System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
        else
        {
            System.out.println("INPUT THE MARK OF ENGLISH II");
            int m2=Integer.parseInt(buf.readLine());
            if(m2>100)
                System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
            else
            {
                System.out.println("INPUT THE MARK OF MALAYALAM");
                int m3=Integer.parseInt(buf.readLine());
                if(m3>100)
                    System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                else
                {
                    System.out.println("INPUT THE MARK OF GEOGRAPHY");
                    int m4=Integer.parseInt(buf.readLine());
                    if(m4>100)
                        System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                    else
                    {
                        System.out.println("INPUT THE MARK OF HISTORY");
                        int m5=Integer.parseInt(buf.readLine());
                        if(m5>100)
                            System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                        else
                        {
                            System.out.println("INPUT THE MARK OF CHEMISTRY");
                            int m6=Integer.parseInt(buf.readLine());
                            if(m6>100)
                                System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");

                            else
                            {
                                System.out.println("INPUT THE MARK OF PHYSICS");
                                int m7=Integer.parseInt(buf.readLine());
                                if(m7>100)
                                    System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");

                                else
                                {
                                    System.out.println("INPUT THE MARK OF BIOLOGY");
                                    int m8=Integer.parseInt(buf.readLine());
                                    if(m8>100)
                                        System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                                    else
                                    {
                                        System.out.println("INPUT THE MARK OF COMPUTER");
                                        int m9=Integer.parseInt(buf.readLine());
                                        if(m9>100)

                                            System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                                        else
                                        {
                                            System.out.println("INPUT THE MARK OF MATHS");
                                            int m10=Integer.parseInt(buf.readLine());
                                            if(m10>100)

                                                System.out.println("TYPE MARKS OF EACH SUBJECT ONLY UPTO 100");
                                            else
                                            {
                                                int t=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10;
                                                double p=Math.abs(t/1000.0*100.0);

                                                System.out.println("THE NAME OF THE STUDENT IS "+n);
                                                System.out.println("THE GENDER OF THE STUDENT IS "+g);
                                                System.out.println("THE ROLL NUMBER OF THE STUDENT IS "+r);   
                                                System.out.println("THE PHONE NUMBER OF THE STUDENT IS "+o); 
                                                System.out.println("THE MARK OF ENGLISH I OF THE STUDENT IS "+m1);
                                                System.out.println("THE MARK OF ENGLISH II OF THE STUDENT IS "+m2);
                                                System.out.println("THE MARK OF MALAYALAM OF THE STUDENT IS "+m3);
                                                System.out.println("THE MARK OF GEOGRAPHY OF THE STUDENT IS "+m4);
                                                System.out.println("THE MARK OF HISTORY OF THE STUDENT IS "+m5);
                                                System.out.println("THE MARK OF PHYSICS OF THE STUDENT IS "+m6);
                                                System.out.println("THE MARK OF CHEMISTRY OF THE STUDENT IS "+m7);
                                                System.out.println("THE MARK OF BIOLOGY OF THE STUDENT IS "+m8);
                                                System.out.println("THE MARK OF COMPUTER OF THE STUDENT IS "+m9);
                                                System.out.println("THE MARK OF MATHS OF THE STUDENT IS "+m10);
                                                System.out.println("THE TOTAL MARK OF THE STUDENT IS "+t);
                                                System.out.println("THE TOTAL PERCENTAGE OF THE STUDENT IS "+p+"%");                                              
                                                if(p<33)

                                                {System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------T.C.........MEET THE PRINCIPAL--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }

                                                else if(p>33&&p<50)
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------NEED MORE HARDWORK--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }

                                                else if(p>50&&p<70)
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------STATISFACTORY--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }
                                                else if(p>70&&p<80)
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------FAIR--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }

                                                else if(p>80&&p<90)
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------GOOD--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }

                                                else
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------EXCELLENT--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }
                                                if(m1<33||m2<33||m3<33||m4<33||m5<33||m6<33||m7<33||m8<33||m9<33||m10<33)                                                
                                                {
                                                    System.out.println();
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println("    \t\t~~~~~!!--------FAILED--------!!~~~~~");
                                                    System.out.println("    \t***************************************************");
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

