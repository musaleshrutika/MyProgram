import java.util.*;

class FiboSeries
{
    public static void main(String arg[])
    {
    
        int i;
        int a=0;
        int b=1;                                                                          
        int c=a+b;
        
     

        System.out.println("Enter the number from user..");
        Scanner sobj = new Scanner(System.in);
         int num = sobj.nextInt();

          for(i=1;i<=num;i++)
             {
               System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;     
                 
             }
             

        
    }
}
