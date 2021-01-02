import java.lang.*;
import java.util.*;

class Remo
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter array element");
        
        for(int i=0;i<arr.length;i++)
        {
           arr[i]= sobj.nextInt();
        }

        System.out.println("Print array element");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}