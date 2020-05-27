import java.util.*;
     class LeadNumb
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a no : ");
                int i=sc.nextInt();
                int x;
                int Even=0,Odd=0;
                     while(i!=0)
                {
                        x=i%10;
                        if(x%2==0)
                        {
                                Even=Even+x;
                        }
                        else
                        {
                                Odd=Odd+x;
                        }
                        i=i/10;
                        
                }
                if(Even==Odd)
                {
                    System.out.println("leadnumber");
                    while(i>=0)
                {
                        if(i%10==0){
                            
                        System.out.println("nest number");
                        i=i/10;
                        break;
                    }
                }
            }
                else
                System.out.println("not a leadnumber");
                sc.close();


              
}
}



