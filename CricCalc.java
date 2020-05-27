import java.util.*;
class CricCalc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE\n\nTO CALCULATE\n  1.STRIKE RATE OF A BATSMAN\n  2.ECONOMY RATE OF A BOWLER");
        int ch=sc.nextInt();
        int bf,runs=0,ecnr,ovbw,r;
        double sr;
        if(ch==1)
        {
            System.out.println("ENTER THE BALLS FACED BY A BATSMAN");
            bf=sc.nextInt();
            System.out.println("ENTER THE RUNS SCORED BY  A BATSMAN");
            runs=sc.nextInt();
            sr=(100*runs)/bf;
            System.out.println("SCORED RUNS :"+runs+"\nBALLS FACED :"+bf);
            System.out.println("STRIKE RATE IS :"+sr);
        }
        if(ch==2)
        {
            System.out.println("ENTER THE NUMBER OF OVERS BOWLED BY THE BOWLER");
            ovbw=sc.nextInt();
            System.out.println("ENTER THE NUMBER OF RUNS CONCEDED BY THE BOWLER PER OVER ORDERWISE");
            for(int i=1;i<=ovbw;i++)
            {
               System.out.println("OVER "+i+":"+(r=sc.nextInt()));
               runs=runs+r; 
            }
             ecnr=runs/ovbw;
              System.out.println("ECONOMY RATE IS"+ecnr);
             
            sc.close();
        }
    }
}           

             
             
             
