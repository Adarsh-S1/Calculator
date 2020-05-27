import java.util.*;
class Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String cities[]=new String[10];
        int std[]=new int[10];
        String city;
        int i,flag=0;
        System.out.println("Input the name of cities and their std");
        for(i=0;i<10;i++)
        {
            cities[i]=sc.next();
            std[i]=sc.nextInt();
        }
            System.out.println("Enter the city to be searched for");
            city=sc.next();
            for(i=0;i<10;i++)
            {
                if(cities[i]==(city))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("Search successful");
                System.out.println("city is"+cities[i]+"and STD is"+std[i]);
            }
            else
            System.out.println("Unsuccessfull Search");
            sc.close();
        }
    }