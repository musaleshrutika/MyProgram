import java.util.*;
 
public  class Semo
{
    public static void main(String arg[])throws Exception
    {
        int i=5,j;
        int k=0;
         
        try
        {

        System.out.println("Enter value for j");  
        Scanner sobj = new Scanner(System.in);
        j=sobj.nextInt();

        k=i/j;
        System.out.println("the value is ..."+k);
        }

        finally
        {
            System.out.println("qqwf");
        }
    } 
}