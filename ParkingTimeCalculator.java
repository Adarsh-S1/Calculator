import java.util.*;
class ParkingTimeCalculator
{
    public static void main(String args[])
    {
        double hours;
        double bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VEHICLE NUMBER");
        System.out.println("ENTER HOW MANY HOURS YOU HAVE PARKED THE VEHICLE");
        hours=sc.nextDouble();
        System.out.println("               ADARSH PARKING CENTER");
        System.out.println("YOU PARKED FOR "+hours+" HOURS");
        
        if(hours<=1)

            System.out.println(bill=30);

        else if(hours>1){
        bill=30*1.5*(hours);

            System.out.println("THE BILL AMOUNT IS "+bill);
        }
            System.out.println("          THANK YOU.....");
        System.out.println("             VISIT AGAIN");
        sc.close();
    }
}









