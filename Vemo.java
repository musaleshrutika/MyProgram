import java.util.*;
import java.lang.*;

   
class Vemo
{

    public static void main(String arg[])
    { 
    int i=5;
    int sum=0;

       
     System.out.println("Enter the value for j");
     Scanner sobj = new Scanner(System.in);
     int  j=sobj.nextInt();

    try
    { 
     
    
       if(j>5)
        {
             throw new Exception();
        }

        sum = i+j;

        System.out.println("the sum is"+sum);
    }

    catch(Exception e)
    {
        System.out.println("The error.."+e);
    }
    finally
    {
        System.out.println("BYE..");
    }
   }  
} 

